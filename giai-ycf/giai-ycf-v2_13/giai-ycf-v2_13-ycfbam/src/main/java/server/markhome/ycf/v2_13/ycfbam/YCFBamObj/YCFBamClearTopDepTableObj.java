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

public class YCFBamClearTopDepTableObj
	implements IYCFBamClearTopDepTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamClearTopDepObj> members;
	private Map<YCFBamScopePKey, IYCFBamClearTopDepObj> allClearTopDep;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByTenantIdx;
	private Map< YCFBamClearDepByClearDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByClearDepIdx;
	private Map< YCFBamClearDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByDefSchemaIdx;
	private Map< YCFBamClearTopDepByClrTopDepTblIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByClrTopDepTblIdx;
	private Map< YCFBamClearTopDepByUNameIdxKey,
		IYCFBamClearTopDepObj > indexByUNameIdx;
	private Map< YCFBamClearTopDepByPrevIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByPrevIdx;
	private Map< YCFBamClearTopDepByNextIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj > > indexByNextIdx;
	public static String TABLE_NAME = "ClearTopDep";
	public static String TABLE_DBNAME = "clr_topdep";

	public YCFBamClearTopDepTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
		allClearTopDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClrTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public YCFBamClearTopDepTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
		allClearTopDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClrTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
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
		allClearTopDep = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClrTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
		IYCFBamClearTopDepObj cur = null;
		Iterator<IYCFBamClearTopDepObj> iter = members.values().iterator();
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
	 *	YCFBamClearTopDepObj.
	 */
	public IYCFBamClearTopDepObj newInstance() {
		IYCFBamClearTopDepObj inst = new YCFBamClearTopDepObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClearTopDepObj.
	 */
	public IYCFBamClearTopDepEditObj newEditInstance( IYCFBamClearTopDepObj orig ) {
		IYCFBamClearTopDepEditObj edit = new YCFBamClearTopDepEditObj( orig );
		return( edit );
	}

	public IYCFBamClearTopDepObj realiseClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearTopDepObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamClearTopDepObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					indexByClearDepIdx.remove( keyClearDepIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByClrTopDepTblIdx != null ) {
				YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
				keyClrTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyClrTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClrTopDepTblIdx = indexByClrTopDepTblIdx.get( keyClrTopDepTblIdx );
				if( mapClrTopDepTblIdx != null ) {
					mapClrTopDepTblIdx.remove( keepObj.getPKey() );
					if( mapClrTopDepTblIdx.size() <= 0 ) {
						indexByClrTopDepTblIdx.remove( keyClrTopDepTblIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByPrevIdx != null ) {
				YCFBamClearTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamClearTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.remove( keepObj.getPKey() );
					if( mapNextIdx.size() <= 0 ) {
						indexByNextIdx.remove( keyNextIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamClearTopDepObj)schema.getClearDepTableObj().realiseClearDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClrTopDepTblIdx != null ) {
				YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
				keyClrTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyClrTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClrTopDepTblIdx = indexByClrTopDepTblIdx.get( keyClrTopDepTblIdx );
				if( mapClrTopDepTblIdx != null ) {
					mapClrTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamClearTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamClearTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allClearTopDep != null ) {
				allClearTopDep.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamClearTopDepObj)schema.getClearDepTableObj().realiseClearDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allClearTopDep != null ) {
				allClearTopDep.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClrTopDepTblIdx != null ) {
				YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
				keyClrTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyClrTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapClrTopDepTblIdx = indexByClrTopDepTblIdx.get( keyClrTopDepTblIdx );
				if( mapClrTopDepTblIdx != null ) {
					mapClrTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamClearTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamClearTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamClearTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamClearTopDepObj createClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = Obj;
		YCFBamClearTopDepBuff buff = obj.getClearTopDepBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().createClearTopDep(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a817" ) ) {
			obj = (IYCFBamClearTopDepObj)(obj.realise());
		}
		IYCFBamClearTopDepObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamClearTopDepObj readClearTopDep( YCFBamScopePKey pkey ) {
		return( readClearTopDep( pkey, false ) );
	}

	public IYCFBamClearTopDepObj readClearTopDep( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamClearTopDepObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamClearTopDepBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamClearTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearTopDepObj readCachedClearTopDep( YCFBamScopePKey pkey ) {
		IYCFBamClearTopDepObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeClearTopDep( IYCFBamClearTopDepObj obj )
	{
		final String S_ProcName = "YCFBamClearTopDepTableObj.reallyDeepDisposeClearTopDep() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearTopDepObj existing = readCachedClearTopDep( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
		keyClrTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyClrTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamClearTopDepByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearTopDepByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamClearTopDepByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );


		schema.getClearSubDep1TableObj().deepDisposeClearSubDep1ByClearTopDepIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByClrTopDepTblIdx != null ) {
			if( indexByClrTopDepTblIdx.containsKey( keyClrTopDepTblIdx ) ) {
				indexByClrTopDepTblIdx.get( keyClrTopDepTblIdx ).remove( pkey );
				if( indexByClrTopDepTblIdx.get( keyClrTopDepTblIdx ).size() <= 0 ) {
					indexByClrTopDepTblIdx.remove( keyClrTopDepTblIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByPrevIdx != null ) {
			if( indexByPrevIdx.containsKey( keyPrevIdx ) ) {
				indexByPrevIdx.get( keyPrevIdx ).remove( pkey );
				if( indexByPrevIdx.get( keyPrevIdx ).size() <= 0 ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}
		}

		if( indexByNextIdx != null ) {
			if( indexByNextIdx.containsKey( keyNextIdx ) ) {
				indexByNextIdx.get( keyNextIdx ).remove( pkey );
				if( indexByNextIdx.get( keyNextIdx ).size() <= 0 ) {
					indexByNextIdx.remove( keyNextIdx );
				}
			}
		}


		schema.getClearDepTableObj().reallyDeepDisposeClearDep( obj );
	}
	public void deepDisposeClearTopDep( YCFBamScopePKey pkey ) {
		IYCFBamClearTopDepObj obj = readCachedClearTopDep( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearTopDepObj lockClearTopDep( YCFBamScopePKey pkey ) {
		IYCFBamClearTopDepObj locked = null;
		YCFBamClearTopDepBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamClearTopDepObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockClearTopDep", pkey );
		}
		return( locked );
	}

	public List<IYCFBamClearTopDepObj> readAllClearTopDep() {
		return( readAllClearTopDep( false ) );
	}

	public List<IYCFBamClearTopDepObj> readAllClearTopDep( boolean forceRead ) {
		final String S_ProcName = "readAllClearTopDep";
		if( ( allClearTopDep == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> map = new HashMap<YCFBamScopePKey,IYCFBamClearTopDepObj>();
			allClearTopDep = map;
			YCFBamClearTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readAllDerived( schema.getAuthorization() );
			YCFBamClearTopDepBuff buff;
			IYCFBamClearTopDepObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
			}
		}
		int len = allClearTopDep.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = allClearTopDep.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearTopDepObj> readCachedAllClearTopDep() {
		final String S_ProcName = "readCachedAllClearTopDep";
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( allClearTopDep != null ) {
			int len = allClearTopDep.size();
			IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
			Iterator<IYCFBamClearTopDepObj> valIter = allClearTopDep.values().iterator();
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
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public IYCFBamClearTopDepObj readClearTopDepByIdIdx( long TenantId,
		long Id )
	{
		return( readClearTopDepByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamClearTopDepObj readClearTopDepByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearTopDepObj obj = readClearTopDep( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByTenantIdx( long TenantId )
	{
		return( readClearTopDepByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		return( readClearTopDepByClearDepIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByClearDepIdx.containsKey( key ) ) {
			dict = indexByClearDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readClearTopDepByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		return( readClearTopDepByClrTopDepTblIdx( TableTenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByClrTopDepTblIdx";
		YCFBamClearTopDepByClrTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByClrTopDepTblIdx == null ) {
			indexByClrTopDepTblIdx = new HashMap< YCFBamClearTopDepByClrTopDepTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByClrTopDepTblIdx.containsKey( key ) ) {
			dict = indexByClrTopDepTblIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamClearTopDepObj obj;
			YCFBamClearTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByClrTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			YCFBamClearTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClrTopDepTblIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearTopDepObj readClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		return( readClearTopDepByUNameIdx( TableTenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamClearTopDepObj readClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearTopDepByUNameIdxKey,
				IYCFBamClearTopDepObj >();
		}
		YCFBamClearTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamClearTopDepObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamClearTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamClearTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readClearTopDepByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByPrevIdx";
		YCFBamClearTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamClearTopDepByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamClearTopDepObj obj;
			YCFBamClearTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamClearTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readClearTopDepByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamClearTopDepObj> readClearTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearTopDepByNextIdx";
		YCFBamClearTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamClearTopDepByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearTopDepObj>();
			IYCFBamClearTopDepObj obj;
			YCFBamClearTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamClearTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearTopDepObj realised = (IYCFBamClearTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
		Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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
		List<IYCFBamClearTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearTopDepObj readCachedClearTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearTopDepObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedClearTopDep( pkey );
		return( obj );
	}

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedClearTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedClearTopDepByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByClearDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByClearDepIdx.containsKey( key ) ) {
				dict = indexByClearDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedClearTopDepByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedClearTopDepByClrTopDepTblIdx";
		YCFBamClearTopDepByClrTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByClrTopDepTblIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByClrTopDepTblIdx.containsKey( key ) ) {
				dict = indexByClrTopDepTblIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public IYCFBamClearTopDepObj readCachedClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		IYCFBamClearTopDepObj obj = null;
		YCFBamClearTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
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

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedClearTopDepByPrevIdx";
		YCFBamClearTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public List<IYCFBamClearTopDepObj> readCachedClearTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedClearTopDepByNextIdx";
		YCFBamClearTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamClearTopDepObj> arrayList = new ArrayList<IYCFBamClearTopDepObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamClearTopDepObj arr[] = new IYCFBamClearTopDepObj[len];
				Iterator<IYCFBamClearTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamClearTopDepObj obj;
			Iterator<IYCFBamClearTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearTopDepObj> cmp = new Comparator<IYCFBamClearTopDepObj>() {
			public int compare( IYCFBamClearTopDepObj lhs, IYCFBamClearTopDepObj rhs ) {
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

	public void deepDisposeClearTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearTopDepObj obj = readCachedClearTopDepByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByTenantIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearTopDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByClearDepIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByClearDepIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByDefSchemaIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByClrTopDepTblIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByClrTopDepTblIdx( TableTenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		IYCFBamClearTopDepObj obj = readCachedClearTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByPrevIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeClearTopDepByNextIdx";
		IYCFBamClearTopDepObj obj;
		List<IYCFBamClearTopDepObj> arrayList = readCachedClearTopDepByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamClearTopDepObj updateClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().updateClearTopDep( schema.getAuthorization(),
			Obj.getClearTopDepBuff() );
		if( Obj.getClassCode().equals( "a817" ) ) {
			obj = (IYCFBamClearTopDepObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = Obj;
		IYCFBamClearTopDepObj prev = obj.getOptionalLookupPrev();
		IYCFBamClearTopDepObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDep( schema.getAuthorization(),
			obj.getClearTopDepBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteClearTopDepByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearTopDepObj obj = readClearTopDep( pkey );
		if( obj != null ) {
			IYCFBamClearTopDepEditObj editObj = (IYCFBamClearTopDepEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamClearTopDepEditObj)obj.beginEdit();
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
		deepDisposeClearTopDepByIdIdx( TenantId,
				Id );
	}

	public void deleteClearTopDepByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeClearTopDepByTenantIdx( TenantId );
	}

	public void deleteClearTopDepByClearDepIdx( long TenantId,
		long RelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByClearDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByClearDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeClearTopDepByClearDepIdx( TenantId,
				RelationId );
	}

	public void deleteClearTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeClearTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteClearTopDepByClrTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		YCFBamClearTopDepByClrTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newClrTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		if( indexByClrTopDepTblIdx == null ) {
			indexByClrTopDepTblIdx = new HashMap< YCFBamClearTopDepByClrTopDepTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByClrTopDepTblIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByClrTopDepTblIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByClrTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClrTopDepTblIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByClrTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
		}
		deepDisposeClearTopDepByClrTopDepTblIdx( TableTenantId,
				TableId );
	}

	public void deleteClearTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearTopDepByUNameIdxKey,
				IYCFBamClearTopDepObj >();
		}
		YCFBamClearTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamClearTopDepObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
		}
		deepDisposeClearTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
	}

	public void deleteClearTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamClearTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamClearTopDepByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeClearTopDepByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteClearTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamClearTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamClearTopDepByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearTopDepObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearTopDepObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamClearTopDepObj> iter = dict.values().iterator();
			IYCFBamClearTopDepObj obj;
			List<IYCFBamClearTopDepObj> toForget = new LinkedList<IYCFBamClearTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().deleteClearTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeClearTopDepByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the YCFBamClearTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamClearTopDepObj refreshed cache instance.
	 */
	public IYCFBamClearTopDepObj moveUpClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpClearTopDep",
				"You cannot move an object that is being edited" );
		}
		YCFBamClearTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getClearTopDepTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamClearTopDepObj)obj.realise();
			IYCFBamClearTopDepObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamClearTopDepObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamClearTopDepObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamClearTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamClearTopDepObj refreshed cache instance.
	 */
	public IYCFBamClearTopDepObj moveDownClearTopDep( IYCFBamClearTopDepObj Obj ) {
		IYCFBamClearTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownClearTopDep",
				"You cannot move an object that is being edited" );
		}
		YCFBamClearTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getClearTopDepTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamClearTopDepObj)obj.realise();
			IYCFBamClearTopDepObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamClearTopDepObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamClearTopDepObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

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

public class YCFBamDelTopDepTableObj
	implements IYCFBamDelTopDepTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamDelTopDepObj> members;
	private Map<YCFBamScopePKey, IYCFBamDelTopDepObj> allDelTopDep;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByTenantIdx;
	private Map< YCFBamDelDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByDefSchemaIdx;
	private Map< YCFBamDelDepByDelDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByDelDepIdx;
	private Map< YCFBamDelTopDepByDelTopDepTblIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByDelTopDepTblIdx;
	private Map< YCFBamDelTopDepByUNameIdxKey,
		IYCFBamDelTopDepObj > indexByUNameIdx;
	private Map< YCFBamDelTopDepByPrevIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByPrevIdx;
	private Map< YCFBamDelTopDepByNextIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj > > indexByNextIdx;
	public static String TABLE_NAME = "DelTopDep";
	public static String TABLE_DBNAME = "del_topdep";

	public YCFBamDelTopDepTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public YCFBamDelTopDepTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
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
		allDelTopDep = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepTblIdx = null;
		indexByUNameIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
		IYCFBamDelTopDepObj cur = null;
		Iterator<IYCFBamDelTopDepObj> iter = members.values().iterator();
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
	 *	YCFBamDelTopDepObj.
	 */
	public IYCFBamDelTopDepObj newInstance() {
		IYCFBamDelTopDepObj inst = new YCFBamDelTopDepObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamDelTopDepObj.
	 */
	public IYCFBamDelTopDepEditObj newEditInstance( IYCFBamDelTopDepObj orig ) {
		IYCFBamDelTopDepEditObj edit = new YCFBamDelTopDepEditObj( orig );
		return( edit );
	}

	public IYCFBamDelTopDepObj realiseDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelTopDepObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamDelTopDepObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.remove( keepObj.getPKey() );
					if( mapDelTopDepTblIdx.size() <= 0 ) {
						indexByDelTopDepTblIdx.remove( keyDelTopDepTblIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByPrevIdx != null ) {
				YCFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamDelTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
			keepObj = (IYCFBamDelTopDepObj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamDelTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allDelTopDep != null ) {
				allDelTopDep.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamDelTopDepObj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelTopDep != null ) {
				allDelTopDep.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepTblIdx != null ) {
				YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
				keyDelTopDepTblIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyDelTopDepTblIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapDelTopDepTblIdx = indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
				if( mapDelTopDepTblIdx != null ) {
					mapDelTopDepTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredTableTenantId( keepObj.getRequiredTableTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevIdx != null ) {
				YCFBamDelTopDepByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamDelTopDepByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamDelTopDepObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamDelTopDepObj createDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = Obj;
		YCFBamDelTopDepBuff buff = obj.getDelTopDepBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().createDelTopDep(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81e" ) ) {
			obj = (IYCFBamDelTopDepObj)(obj.realise());
		}
		IYCFBamDelTopDepObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamDelTopDepObj readDelTopDep( YCFBamScopePKey pkey ) {
		return( readDelTopDep( pkey, false ) );
	}

	public IYCFBamDelTopDepObj readDelTopDep( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamDelTopDepObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamDelTopDepBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamDelTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelTopDepObj readCachedDelTopDep( YCFBamScopePKey pkey ) {
		IYCFBamDelTopDepObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelTopDep( IYCFBamDelTopDepObj obj )
	{
		final String S_ProcName = "YCFBamDelTopDepTableObj.reallyDeepDisposeDelTopDep() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelTopDepObj existing = readCachedDelTopDep( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		keyDelTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyDelTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamDelTopDepByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelTopDepByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamDelTopDepByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );


		schema.getDelSubDep1TableObj().deepDisposeDelSubDep1ByDelTopDepIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByDelTopDepTblIdx != null ) {
			if( indexByDelTopDepTblIdx.containsKey( keyDelTopDepTblIdx ) ) {
				indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx ).remove( pkey );
				if( indexByDelTopDepTblIdx.get( keyDelTopDepTblIdx ).size() <= 0 ) {
					indexByDelTopDepTblIdx.remove( keyDelTopDepTblIdx );
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


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelTopDep( YCFBamScopePKey pkey ) {
		IYCFBamDelTopDepObj obj = readCachedDelTopDep( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelTopDepObj lockDelTopDep( YCFBamScopePKey pkey ) {
		IYCFBamDelTopDepObj locked = null;
		YCFBamDelTopDepBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamDelTopDepObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDelTopDep", pkey );
		}
		return( locked );
	}

	public List<IYCFBamDelTopDepObj> readAllDelTopDep() {
		return( readAllDelTopDep( false ) );
	}

	public List<IYCFBamDelTopDepObj> readAllDelTopDep( boolean forceRead ) {
		final String S_ProcName = "readAllDelTopDep";
		if( ( allDelTopDep == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> map = new HashMap<YCFBamScopePKey,IYCFBamDelTopDepObj>();
			allDelTopDep = map;
			YCFBamDelTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readAllDerived( schema.getAuthorization() );
			YCFBamDelTopDepBuff buff;
			IYCFBamDelTopDepObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
			}
		}
		int len = allDelTopDep.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = allDelTopDep.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelTopDepObj> readCachedAllDelTopDep() {
		final String S_ProcName = "readCachedAllDelTopDep";
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( allDelTopDep != null ) {
			int len = allDelTopDep.size();
			IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
			Iterator<IYCFBamDelTopDepObj> valIter = allDelTopDep.values().iterator();
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
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public IYCFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		return( readDelTopDepByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamDelTopDepObj readDelTopDepByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelTopDepObj obj = readDelTopDep( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId )
	{
		return( readDelTopDepByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelTopDepByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelTopDepByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		return( readDelTopDepByDelTopDepTblIdx( TableTenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByDelTopDepTblIdx";
		YCFBamDelTopDepByDelTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByDelTopDepTblIdx == null ) {
			indexByDelTopDepTblIdx = new HashMap< YCFBamDelTopDepByDelTopDepTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDelTopDepTblIdx.containsKey( key ) ) {
			dict = indexByDelTopDepTblIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamDelTopDepObj obj;
			YCFBamDelTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			YCFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelTopDepTblIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDelTopDepObj readDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		return( readDelTopDepByUNameIdx( TableTenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamDelTopDepObj readDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelTopDepByUNameIdxKey,
				IYCFBamDelTopDepObj >();
		}
		YCFBamDelTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamDelTopDepObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamDelTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamDelTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readDelTopDepByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByPrevIdx";
		YCFBamDelTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamDelTopDepByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamDelTopDepObj obj;
			YCFBamDelTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readDelTopDepByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamDelTopDepObj> readDelTopDepByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelTopDepByNextIdx";
		YCFBamDelTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamDelTopDepByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelTopDepObj>();
			IYCFBamDelTopDepObj obj;
			YCFBamDelTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamDelTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelTopDepObj realised = (IYCFBamDelTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
		Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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
		List<IYCFBamDelTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDelTopDepObj readCachedDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelTopDepObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelTopDep( pkey );
		return( obj );
	}

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelTopDepByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelTopDepByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByDelDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedDelTopDepByDelTopDepTblIdx";
		YCFBamDelTopDepByDelTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByDelTopDepTblIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByDelTopDepTblIdx.containsKey( key ) ) {
				dict = indexByDelTopDepTblIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public IYCFBamDelTopDepObj readCachedDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		IYCFBamDelTopDepObj obj = null;
		YCFBamDelTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
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

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedDelTopDepByPrevIdx";
		YCFBamDelTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public List<IYCFBamDelTopDepObj> readCachedDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedDelTopDepByNextIdx";
		YCFBamDelTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamDelTopDepObj> arrayList = new ArrayList<IYCFBamDelTopDepObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamDelTopDepObj arr[] = new IYCFBamDelTopDepObj[len];
				Iterator<IYCFBamDelTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamDelTopDepObj obj;
			Iterator<IYCFBamDelTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelTopDepObj> cmp = new Comparator<IYCFBamDelTopDepObj>() {
			public int compare( IYCFBamDelTopDepObj lhs, IYCFBamDelTopDepObj rhs ) {
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

	public void deepDisposeDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelTopDepObj obj = readCachedDelTopDepByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByTenantIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDefSchemaIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDelDepIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByDelTopDepTblIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByDelTopDepTblIdx( TableTenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		IYCFBamDelTopDepObj obj = readCachedDelTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByPrevIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeDelTopDepByNextIdx";
		IYCFBamDelTopDepObj obj;
		List<IYCFBamDelTopDepObj> arrayList = readCachedDelTopDepByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamDelTopDepObj updateDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().updateDelTopDep( schema.getAuthorization(),
			Obj.getDelTopDepBuff() );
		if( Obj.getClassCode().equals( "a81e" ) ) {
			obj = (IYCFBamDelTopDepObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = Obj;
		IYCFBamDelTopDepObj prev = obj.getOptionalLookupPrev();
		IYCFBamDelTopDepObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDep( schema.getAuthorization(),
			obj.getDelTopDepBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteDelTopDepByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelTopDepObj obj = readDelTopDep( pkey );
		if( obj != null ) {
			IYCFBamDelTopDepEditObj editObj = (IYCFBamDelTopDepEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamDelTopDepEditObj)obj.beginEdit();
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
		deepDisposeDelTopDepByIdIdx( TenantId,
				Id );
	}

	public void deleteDelTopDepByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelTopDepByTenantIdx( TenantId );
	}

	public void deleteDelTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelTopDepByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByDelDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelTopDepByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelTopDepByDelTopDepTblIdx( long TableTenantId,
		long TableId )
	{
		YCFBamDelTopDepByDelTopDepTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		if( indexByDelTopDepTblIdx == null ) {
			indexByDelTopDepTblIdx = new HashMap< YCFBamDelTopDepByDelTopDepTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByDelTopDepTblIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByDelTopDepTblIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelTopDepTblIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( schema.getAuthorization(),
				TableTenantId,
				TableId );
		}
		deepDisposeDelTopDepByDelTopDepTblIdx( TableTenantId,
				TableId );
	}

	public void deleteDelTopDepByUNameIdx( long TableTenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelTopDepByUNameIdxKey,
				IYCFBamDelTopDepObj >();
		}
		YCFBamDelTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamDelTopDepObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByUNameIdx( schema.getAuthorization(),
				TableTenantId,
				TableId,
				Name );
		}
		deepDisposeDelTopDepByUNameIdx( TableTenantId,
				TableId,
				Name );
	}

	public void deleteDelTopDepByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamDelTopDepByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamDelTopDepByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeDelTopDepByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteDelTopDepByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamDelTopDepByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamDelTopDepByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelTopDepObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelTopDepObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamDelTopDepObj> iter = dict.values().iterator();
			IYCFBamDelTopDepObj obj;
			List<IYCFBamDelTopDepObj> toForget = new LinkedList<IYCFBamDelTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().deleteDelTopDepByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeDelTopDepByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the YCFBamDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDelTopDepObj refreshed cache instance.
	 */
	public IYCFBamDelTopDepObj moveUpDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpDelTopDep",
				"You cannot move an object that is being edited" );
		}
		YCFBamDelTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDelTopDepTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamDelTopDepObj)obj.realise();
			IYCFBamDelTopDepObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamDelTopDepObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamDelTopDepObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDelTopDepObj refreshed cache instance.
	 */
	public IYCFBamDelTopDepObj moveDownDelTopDep( IYCFBamDelTopDepObj Obj ) {
		IYCFBamDelTopDepObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownDelTopDep",
				"You cannot move an object that is being edited" );
		}
		YCFBamDelTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelTopDep().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDelTopDepTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamDelTopDepObj)obj.realise();
			IYCFBamDelTopDepObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamDelTopDepObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamDelTopDepObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

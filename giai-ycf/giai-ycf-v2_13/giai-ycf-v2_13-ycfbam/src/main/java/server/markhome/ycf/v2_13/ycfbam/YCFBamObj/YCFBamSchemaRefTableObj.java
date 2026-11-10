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

public class YCFBamSchemaRefTableObj
	implements IYCFBamSchemaRefTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamSchemaRefObj> members;
	private Map<YCFBamScopePKey, IYCFBamSchemaRefObj> allSchemaRef;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj > > indexByTenantIdx;
	private Map< YCFBamSchemaRefBySchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj > > indexBySchemaIdx;
	private Map< YCFBamSchemaRefByUNameIdxKey,
		IYCFBamSchemaRefObj > indexByUNameIdx;
	private Map< YCFBamSchemaRefByRefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj > > indexByRefSchemaIdx;
	private Map< YCFBamSchemaRefByPrevIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj > > indexByPrevIdx;
	private Map< YCFBamSchemaRefByNextIdxKey,
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj > > indexByNextIdx;
	public static String TABLE_NAME = "SchemaRef";
	public static String TABLE_DBNAME = "schema_ref";

	public YCFBamSchemaRefTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
		allSchemaRef = null;
		indexByTenantIdx = null;
		indexBySchemaIdx = null;
		indexByUNameIdx = null;
		indexByRefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public YCFBamSchemaRefTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
		allSchemaRef = null;
		indexByTenantIdx = null;
		indexBySchemaIdx = null;
		indexByUNameIdx = null;
		indexByRefSchemaIdx = null;
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
		return( null );
	}


	public void minimizeMemory() {
		allSchemaRef = null;
		indexByTenantIdx = null;
		indexBySchemaIdx = null;
		indexByUNameIdx = null;
		indexByRefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
		IYCFBamSchemaRefObj cur = null;
		Iterator<IYCFBamSchemaRefObj> iter = members.values().iterator();
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
	 *	YCFBamSchemaRefObj.
	 */
	public IYCFBamSchemaRefObj newInstance() {
		IYCFBamSchemaRefObj inst = new YCFBamSchemaRefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSchemaRefObj.
	 */
	public IYCFBamSchemaRefEditObj newEditInstance( IYCFBamSchemaRefObj orig ) {
		IYCFBamSchemaRefEditObj edit = new YCFBamSchemaRefEditObj( orig );
		return( edit );
	}

	public IYCFBamSchemaRefObj realiseSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamSchemaRefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamSchemaRefObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByRefSchemaIdx != null ) {
				YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.remove( keepObj.getPKey() );
					if( mapRefSchemaIdx.size() <= 0 ) {
						indexByRefSchemaIdx.remove( keyRefSchemaIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamSchemaRefByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
			keepObj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRefSchemaIdx != null ) {
				YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamSchemaRefByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSchemaRef != null ) {
				allSchemaRef.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaRef != null ) {
				allSchemaRef.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRefSchemaIdx != null ) {
				YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamSchemaRefByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamScopePKey, IYCFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamSchemaRefObj createSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = Obj;
		YCFBamSchemaRefBuff buff = obj.getSchemaRefBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().createSchemaRef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a803" ) ) {
			obj = (IYCFBamSchemaRefObj)(obj.realise());
		}
		IYCFBamSchemaRefObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamSchemaRefObj readSchemaRef( YCFBamScopePKey pkey ) {
		return( readSchemaRef( pkey, false ) );
	}

	public IYCFBamSchemaRefObj readSchemaRef( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamSchemaRefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamSchemaRefBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamSchemaRefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaRefObj readCachedSchemaRef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaRefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaRef( IYCFBamSchemaRefObj obj )
	{
		final String S_ProcName = "YCFBamSchemaRefTableObj.reallyDeepDisposeSchemaRef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamSchemaRefObj existing = readCachedSchemaRef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamSchemaRefBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );

		YCFBamSchemaRefByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		keyRefSchemaIdx.setOptionalRefSchemaTenantId( existing.getOptionalRefSchemaTenantId() );
		keyRefSchemaIdx.setOptionalRefSchemaId( existing.getOptionalRefSchemaId() );

		YCFBamSchemaRefByPrevIdxKey keyPrevIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamSchemaRefByNextIdxKey keyNextIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );



		if( indexBySchemaIdx != null ) {
			if( indexBySchemaIdx.containsKey( keySchemaIdx ) ) {
				indexBySchemaIdx.get( keySchemaIdx ).remove( pkey );
				if( indexBySchemaIdx.get( keySchemaIdx ).size() <= 0 ) {
					indexBySchemaIdx.remove( keySchemaIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByRefSchemaIdx != null ) {
			if( indexByRefSchemaIdx.containsKey( keyRefSchemaIdx ) ) {
				indexByRefSchemaIdx.get( keyRefSchemaIdx ).remove( pkey );
				if( indexByRefSchemaIdx.get( keyRefSchemaIdx ).size() <= 0 ) {
					indexByRefSchemaIdx.remove( keyRefSchemaIdx );
				}
			}
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


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeSchemaRef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaRefObj obj = readCachedSchemaRef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamSchemaRefObj lockSchemaRef( YCFBamScopePKey pkey ) {
		IYCFBamSchemaRefObj locked = null;
		YCFBamSchemaRefBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamSchemaRefObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSchemaRef", pkey );
		}
		return( locked );
	}

	public List<IYCFBamSchemaRefObj> readAllSchemaRef() {
		return( readAllSchemaRef( false ) );
	}

	public List<IYCFBamSchemaRefObj> readAllSchemaRef( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaRef";
		if( ( allSchemaRef == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> map = new HashMap<YCFBamScopePKey,IYCFBamSchemaRefObj>();
			allSchemaRef = map;
			YCFBamSchemaRefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readAllDerived( schema.getAuthorization() );
			YCFBamSchemaRefBuff buff;
			IYCFBamSchemaRefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
			}
		}
		int len = allSchemaRef.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = allSchemaRef.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRefObj> readCachedAllSchemaRef() {
		final String S_ProcName = "readCachedAllSchemaRef";
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( allSchemaRef != null ) {
			int len = allSchemaRef.size();
			IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
			Iterator<IYCFBamSchemaRefObj> valIter = allSchemaRef.values().iterator();
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
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public IYCFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaRefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaRefObj obj = readSchemaRef( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId )
	{
		return( readSchemaRefByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		return( readSchemaRefBySchemaIdx( TenantId,
			SchemaId,
			false ) );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefBySchemaIdx";
		YCFBamSchemaRefBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaRefBySchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
			IYCFBamSchemaRefObj obj;
			YCFBamSchemaRefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaId );
			YCFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaRefObj readSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		return( readSchemaRefByUNameIdx( TenantId,
			SchemaId,
			Name,
			false ) );
	}

	public IYCFBamSchemaRefObj readSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamSchemaRefByUNameIdxKey,
				IYCFBamSchemaRefObj >();
		}
		YCFBamSchemaRefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaRefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamSchemaRefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaRefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		return( readSchemaRefByRefSchemaIdx( RefSchemaTenantId,
			RefSchemaId,
			false ) );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByRefSchemaIdx";
		YCFBamSchemaRefByRefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
		if( indexByRefSchemaIdx == null ) {
			indexByRefSchemaIdx = new HashMap< YCFBamSchemaRefByRefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByRefSchemaIdx.containsKey( key ) ) {
			dict = indexByRefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
			IYCFBamSchemaRefObj obj;
			YCFBamSchemaRefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
			YCFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readSchemaRefByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByPrevIdx";
		YCFBamSchemaRefByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamSchemaRefByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
			IYCFBamSchemaRefObj obj;
			YCFBamSchemaRefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readSchemaRefByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByNextIdx";
		YCFBamSchemaRefByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamSchemaRefByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamSchemaRefObj>();
			IYCFBamSchemaRefObj obj;
			YCFBamSchemaRefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaRefObj realised = (IYCFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
		Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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
		List<IYCFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaRefObj readCachedSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaRefObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaRef( pkey );
		return( obj );
	}

	public List<IYCFBamSchemaRefObj> readCachedSchemaRefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaRefByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
				Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRefObj obj;
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public List<IYCFBamSchemaRefObj> readCachedSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		final String S_ProcName = "readCachedSchemaRefBySchemaIdx";
		YCFBamSchemaRefBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
				Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRefObj obj;
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public IYCFBamSchemaRefObj readCachedSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		IYCFBamSchemaRefObj obj = null;
		YCFBamSchemaRefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
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

	public List<IYCFBamSchemaRefObj> readCachedSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaRefByRefSchemaIdx";
		YCFBamSchemaRefByRefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( indexByRefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
			if( indexByRefSchemaIdx.containsKey( key ) ) {
				dict = indexByRefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
				Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRefObj obj;
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public List<IYCFBamSchemaRefObj> readCachedSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedSchemaRefByPrevIdx";
		YCFBamSchemaRefByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
				Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRefObj obj;
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public List<IYCFBamSchemaRefObj> readCachedSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedSchemaRefByNextIdx";
		YCFBamSchemaRefByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamSchemaRefObj> arrayList = new ArrayList<IYCFBamSchemaRefObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaRefObj arr[] = new IYCFBamSchemaRefObj[len];
				Iterator<IYCFBamSchemaRefObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaRefObj obj;
			Iterator<IYCFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaRefObj> cmp = new Comparator<IYCFBamSchemaRefObj>() {
			public int compare( IYCFBamSchemaRefObj lhs, IYCFBamSchemaRefObj rhs ) {
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

	public void deepDisposeSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaRefObj obj = readCachedSchemaRefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaRefByTenantIdx";
		IYCFBamSchemaRefObj obj;
		List<IYCFBamSchemaRefObj> arrayList = readCachedSchemaRefByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		final String S_ProcName = "deepDisposeSchemaRefBySchemaIdx";
		IYCFBamSchemaRefObj obj;
		List<IYCFBamSchemaRefObj> arrayList = readCachedSchemaRefBySchemaIdx( TenantId,
				SchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		IYCFBamSchemaRefObj obj = readCachedSchemaRefByUNameIdx( TenantId,
				SchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		final String S_ProcName = "deepDisposeSchemaRefByRefSchemaIdx";
		IYCFBamSchemaRefObj obj;
		List<IYCFBamSchemaRefObj> arrayList = readCachedSchemaRefByRefSchemaIdx( RefSchemaTenantId,
				RefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeSchemaRefByPrevIdx";
		IYCFBamSchemaRefObj obj;
		List<IYCFBamSchemaRefObj> arrayList = readCachedSchemaRefByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeSchemaRefByNextIdx";
		IYCFBamSchemaRefObj obj;
		List<IYCFBamSchemaRefObj> arrayList = readCachedSchemaRefByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamSchemaRefObj updateSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().updateSchemaRef( schema.getAuthorization(),
			Obj.getSchemaRefBuff() );
		if( Obj.getClassCode().equals( "a803" ) ) {
			obj = (IYCFBamSchemaRefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = Obj;
		IYCFBamSchemaRefObj prev = obj.getOptionalLookupPrev();
		IYCFBamSchemaRefObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRef( schema.getAuthorization(),
			obj.getSchemaRefBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaRefObj obj = readSchemaRef( pkey );
		if( obj != null ) {
			IYCFBamSchemaRefEditObj editObj = (IYCFBamSchemaRefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamSchemaRefEditObj)obj.beginEdit();
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
		deepDisposeSchemaRefByIdIdx( TenantId,
				Id );
	}

	public void deleteSchemaRefByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamSchemaRefObj> iter = dict.values().iterator();
			IYCFBamSchemaRefObj obj;
			List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaRefByTenantIdx( TenantId );
	}

	public void deleteSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		YCFBamSchemaRefBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaRefBySchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaId );
			Iterator<IYCFBamSchemaRefObj> iter = dict.values().iterator();
			IYCFBamSchemaRefObj obj;
			List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaId );
		}
		deepDisposeSchemaRefBySchemaIdx( TenantId,
				SchemaId );
	}

	public void deleteSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamSchemaRefByUNameIdxKey,
				IYCFBamSchemaRefObj >();
		}
		YCFBamSchemaRefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaRefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaId,
				Name );
		}
		deepDisposeSchemaRefByUNameIdx( TenantId,
				SchemaId,
				Name );
	}

	public void deleteSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		YCFBamSchemaRefByRefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		if( indexByRefSchemaIdx == null ) {
			indexByRefSchemaIdx = new HashMap< YCFBamSchemaRefByRefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( indexByRefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict = indexByRefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
			Iterator<IYCFBamSchemaRefObj> iter = dict.values().iterator();
			IYCFBamSchemaRefObj obj;
			List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRefSchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
		}
		deepDisposeSchemaRefByRefSchemaIdx( RefSchemaTenantId,
				RefSchemaId );
	}

	public void deleteSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamSchemaRefByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamSchemaRefByPrevIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamSchemaRefObj> iter = dict.values().iterator();
			IYCFBamSchemaRefObj obj;
			List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeSchemaRefByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamSchemaRefByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamSchemaRefByNextIdxKey,
				Map< YCFBamScopePKey, IYCFBamSchemaRefObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamSchemaRefObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamSchemaRefObj> iter = dict.values().iterator();
			IYCFBamSchemaRefObj obj;
			List<IYCFBamSchemaRefObj> toForget = new LinkedList<IYCFBamSchemaRefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeSchemaRefByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the YCFBamSchemaRefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamSchemaRefObj refreshed cache instance.
	 */
	public IYCFBamSchemaRefObj moveUpSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpSchemaRef",
				"You cannot move an object that is being edited" );
		}
		YCFBamSchemaRefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getSchemaRefTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamSchemaRefObj)obj.realise();
			IYCFBamSchemaRefObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamSchemaRefObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamSchemaRefObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamSchemaRefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamSchemaRefObj refreshed cache instance.
	 */
	public IYCFBamSchemaRefObj moveDownSchemaRef( IYCFBamSchemaRefObj Obj ) {
		IYCFBamSchemaRefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownSchemaRef",
				"You cannot move an object that is being edited" );
		}
		YCFBamSchemaRefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaRef().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getSchemaRefTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamSchemaRefObj)obj.realise();
			IYCFBamSchemaRefObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamSchemaRefObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamSchemaRefObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

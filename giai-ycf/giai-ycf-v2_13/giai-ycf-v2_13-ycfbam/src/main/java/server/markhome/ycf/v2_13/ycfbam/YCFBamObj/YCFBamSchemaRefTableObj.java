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

public class CFBamSchemaRefTableObj
	implements ICFBamSchemaRefTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamSchemaRefObj> members;
	private Map<CFBamScopePKey, ICFBamSchemaRefObj> allSchemaRef;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaRefObj > > indexByTenantIdx;
	private Map< CFBamSchemaRefBySchemaIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaRefObj > > indexBySchemaIdx;
	private Map< CFBamSchemaRefByUNameIdxKey,
		ICFBamSchemaRefObj > indexByUNameIdx;
	private Map< CFBamSchemaRefByRefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaRefObj > > indexByRefSchemaIdx;
	private Map< CFBamSchemaRefByPrevIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaRefObj > > indexByPrevIdx;
	private Map< CFBamSchemaRefByNextIdxKey,
		Map<CFBamScopePKey, ICFBamSchemaRefObj > > indexByNextIdx;
	public static String TABLE_NAME = "SchemaRef";
	public static String TABLE_DBNAME = "schema_ref";

	public CFBamSchemaRefTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
		allSchemaRef = null;
		indexByTenantIdx = null;
		indexBySchemaIdx = null;
		indexByUNameIdx = null;
		indexByRefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
	}

	public CFBamSchemaRefTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
		allSchemaRef = null;
		indexByTenantIdx = null;
		indexBySchemaIdx = null;
		indexByUNameIdx = null;
		indexByRefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
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
		List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
		ICFBamSchemaRefObj cur = null;
		Iterator<ICFBamSchemaRefObj> iter = members.values().iterator();
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
	 *	CFBamSchemaRefObj.
	 */
	public ICFBamSchemaRefObj newInstance() {
		ICFBamSchemaRefObj inst = new CFBamSchemaRefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamSchemaRefObj.
	 */
	public ICFBamSchemaRefEditObj newEditInstance( ICFBamSchemaRefObj orig ) {
		ICFBamSchemaRefEditObj edit = new CFBamSchemaRefEditObj( orig );
		return( edit );
	}

	public ICFBamSchemaRefObj realiseSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamSchemaRefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamSchemaRefObj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByRefSchemaIdx != null ) {
				CFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.remove( keepObj.getPKey() );
					if( mapRefSchemaIdx.size() <= 0 ) {
						indexByRefSchemaIdx.remove( keyRefSchemaIdx );
					}
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.remove( keepObj.getPKey() );
					if( mapPrevIdx.size() <= 0 ) {
						indexByPrevIdx.remove( keyPrevIdx );
					}
				}
			}

			if( indexByNextIdx != null ) {
				CFBamSchemaRefByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
			keepObj = (ICFBamSchemaRefObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRefSchemaIdx != null ) {
				CFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamSchemaRefByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
			keepObj = (ICFBamSchemaRefObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaRef != null ) {
				allSchemaRef.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaRefBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamSchemaRefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaId( keepObj.getRequiredSchemaId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRefSchemaIdx != null ) {
				CFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
				keyRefSchemaIdx.setOptionalRefSchemaTenantId( keepObj.getOptionalRefSchemaTenantId() );
				keyRefSchemaIdx.setOptionalRefSchemaId( keepObj.getOptionalRefSchemaId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapRefSchemaIdx = indexByRefSchemaIdx.get( keyRefSchemaIdx );
				if( mapRefSchemaIdx != null ) {
					mapRefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				CFBamSchemaRefByPrevIdxKey keyPrevIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				CFBamSchemaRefByNextIdxKey keyNextIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<CFBamScopePKey, ICFBamSchemaRefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamSchemaRefObj createSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = Obj;
		CFBamSchemaRefBuff buff = obj.getSchemaRefBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().createSchemaRef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a803" ) ) {
			obj = (ICFBamSchemaRefObj)(obj.realise());
		}
		ICFBamSchemaRefObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamSchemaRefObj readSchemaRef( CFBamScopePKey pkey ) {
		return( readSchemaRef( pkey, false ) );
	}

	public ICFBamSchemaRefObj readSchemaRef( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamSchemaRefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamSchemaRefBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamSchemaRefObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaRefObj readCachedSchemaRef( CFBamScopePKey pkey ) {
		ICFBamSchemaRefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaRef( ICFBamSchemaRefObj obj )
	{
		final String S_ProcName = "CFBamSchemaRefTableObj.reallyDeepDisposeSchemaRef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamSchemaRefObj existing = readCachedSchemaRef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamSchemaRefBySchemaIdxKey keySchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );

		CFBamSchemaRefByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		keyRefSchemaIdx.setOptionalRefSchemaTenantId( existing.getOptionalRefSchemaTenantId() );
		keyRefSchemaIdx.setOptionalRefSchemaId( existing.getOptionalRefSchemaId() );

		CFBamSchemaRefByPrevIdxKey keyPrevIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		CFBamSchemaRefByNextIdxKey keyNextIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
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
	public void deepDisposeSchemaRef( CFBamScopePKey pkey ) {
		ICFBamSchemaRefObj obj = readCachedSchemaRef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamSchemaRefObj lockSchemaRef( CFBamScopePKey pkey ) {
		ICFBamSchemaRefObj locked = null;
		CFBamSchemaRefBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamSchemaRefObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSchemaRef", pkey );
		}
		return( locked );
	}

	public List<ICFBamSchemaRefObj> readAllSchemaRef() {
		return( readAllSchemaRef( false ) );
	}

	public List<ICFBamSchemaRefObj> readAllSchemaRef( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaRef";
		if( ( allSchemaRef == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> map = new HashMap<CFBamScopePKey,ICFBamSchemaRefObj>();
			allSchemaRef = map;
			CFBamSchemaRefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readAllDerived( schema.getAuthorization() );
			CFBamSchemaRefBuff buff;
			ICFBamSchemaRefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
			}
		}
		int len = allSchemaRef.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = allSchemaRef.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRefObj> readCachedAllSchemaRef() {
		final String S_ProcName = "readCachedAllSchemaRef";
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( allSchemaRef != null ) {
			int len = allSchemaRef.size();
			ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
			Iterator<ICFBamSchemaRefObj> valIter = allSchemaRef.values().iterator();
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
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public ICFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaRefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamSchemaRefObj readSchemaRefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaRefObj obj = readSchemaRef( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId )
	{
		return( readSchemaRefByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		return( readSchemaRefBySchemaIdx( TenantId,
			SchemaId,
			false ) );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefBySchemaIdx( long TenantId,
		long SchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefBySchemaIdx";
		CFBamSchemaRefBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaRefBySchemaIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
			ICFBamSchemaRefObj obj;
			CFBamSchemaRefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaId );
			CFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaRefObj readSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		return( readSchemaRefByUNameIdx( TenantId,
			SchemaId,
			Name,
			false ) );
	}

	public ICFBamSchemaRefObj readSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamSchemaRefByUNameIdxKey,
				ICFBamSchemaRefObj >();
		}
		CFBamSchemaRefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaRefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamSchemaRefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaRefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		return( readSchemaRefByRefSchemaIdx( RefSchemaTenantId,
			RefSchemaId,
			false ) );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByRefSchemaIdx";
		CFBamSchemaRefByRefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
		if( indexByRefSchemaIdx == null ) {
			indexByRefSchemaIdx = new HashMap< CFBamSchemaRefByRefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByRefSchemaIdx.containsKey( key ) ) {
			dict = indexByRefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
			ICFBamSchemaRefObj obj;
			CFBamSchemaRefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
			CFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readSchemaRefByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByPrevIdx";
		CFBamSchemaRefByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamSchemaRefByPrevIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
			ICFBamSchemaRefObj obj;
			CFBamSchemaRefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			CFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readSchemaRefByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<ICFBamSchemaRefObj> readSchemaRefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaRefByNextIdx";
		CFBamSchemaRefByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamSchemaRefByNextIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamSchemaRefObj>();
			ICFBamSchemaRefObj obj;
			CFBamSchemaRefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			CFBamSchemaRefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaRefObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaRefObj realised = (ICFBamSchemaRefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
		Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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
		List<ICFBamSchemaRefObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaRefObj readCachedSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		ICFBamSchemaRefObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaRef( pkey );
		return( obj );
	}

	public List<ICFBamSchemaRefObj> readCachedSchemaRefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaRefByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
				Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRefObj obj;
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public List<ICFBamSchemaRefObj> readCachedSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		final String S_ProcName = "readCachedSchemaRefBySchemaIdx";
		CFBamSchemaRefBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( indexBySchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
				Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRefObj obj;
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public ICFBamSchemaRefObj readCachedSchemaRefByUNameIdx( long TenantId,
		long SchemaId,
		String Name )
	{
		ICFBamSchemaRefObj obj = null;
		CFBamSchemaRefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
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

	public List<ICFBamSchemaRefObj> readCachedSchemaRefByRefSchemaIdx( Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaRefByRefSchemaIdx";
		CFBamSchemaRefByRefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( indexByRefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
			if( indexByRefSchemaIdx.containsKey( key ) ) {
				dict = indexByRefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
				Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRefObj obj;
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public List<ICFBamSchemaRefObj> readCachedSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedSchemaRefByPrevIdx";
		CFBamSchemaRefByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( indexByPrevIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
				Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRefObj obj;
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public List<ICFBamSchemaRefObj> readCachedSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedSchemaRefByNextIdx";
		CFBamSchemaRefByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<ICFBamSchemaRefObj> arrayList = new ArrayList<ICFBamSchemaRefObj>();
		if( indexByNextIdx != null ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				ICFBamSchemaRefObj arr[] = new ICFBamSchemaRefObj[len];
				Iterator<ICFBamSchemaRefObj> valIter = dict.values().iterator();
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
			ICFBamSchemaRefObj obj;
			Iterator<ICFBamSchemaRefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaRefObj> cmp = new Comparator<ICFBamSchemaRefObj>() {
			public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	public void deepDisposeSchemaRefByIdIdx( long TenantId,
		long Id )
	{
		ICFBamSchemaRefObj obj = readCachedSchemaRefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaRefByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaRefByTenantIdx";
		ICFBamSchemaRefObj obj;
		List<ICFBamSchemaRefObj> arrayList = readCachedSchemaRefByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRefObj obj;
		List<ICFBamSchemaRefObj> arrayList = readCachedSchemaRefBySchemaIdx( TenantId,
				SchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRefObj obj = readCachedSchemaRefByUNameIdx( TenantId,
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
		ICFBamSchemaRefObj obj;
		List<ICFBamSchemaRefObj> arrayList = readCachedSchemaRefByRefSchemaIdx( RefSchemaTenantId,
				RefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRefObj obj;
		List<ICFBamSchemaRefObj> arrayList = readCachedSchemaRefByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRefObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaRefObj obj;
		List<ICFBamSchemaRefObj> arrayList = readCachedSchemaRefByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaRefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamSchemaRefObj updateSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().updateSchemaRef( schema.getAuthorization(),
			Obj.getSchemaRefBuff() );
		if( Obj.getClassCode().equals( "a803" ) ) {
			obj = (ICFBamSchemaRefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = Obj;
		ICFBamSchemaRefObj prev = obj.getOptionalLookupPrev();
		ICFBamSchemaRefObj next = obj.getOptionalLookupNext();
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRef( schema.getAuthorization(),
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
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaRefObj obj = readSchemaRef( pkey );
		if( obj != null ) {
			ICFBamSchemaRefEditObj editObj = (ICFBamSchemaRefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamSchemaRefEditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamSchemaRefObj> iter = dict.values().iterator();
			ICFBamSchemaRefObj obj;
			List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaRefByTenantIdx( TenantId );
	}

	public void deleteSchemaRefBySchemaIdx( long TenantId,
		long SchemaId )
	{
		CFBamSchemaRefBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaRefBySchemaIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict = indexBySchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaId );
			Iterator<ICFBamSchemaRefObj> iter = dict.values().iterator();
			ICFBamSchemaRefObj obj;
			List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefBySchemaIdx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< CFBamSchemaRefByUNameIdxKey,
				ICFBamSchemaRefObj >();
		}
		CFBamSchemaRefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaRefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByUNameIdx( schema.getAuthorization(),
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
		CFBamSchemaRefByRefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );
		if( indexByRefSchemaIdx == null ) {
			indexByRefSchemaIdx = new HashMap< CFBamSchemaRefByRefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( indexByRefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict = indexByRefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
			Iterator<ICFBamSchemaRefObj> iter = dict.values().iterator();
			ICFBamSchemaRefObj obj;
			List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByRefSchemaIdx( schema.getAuthorization(),
				RefSchemaTenantId,
				RefSchemaId );
		}
		deepDisposeSchemaRefByRefSchemaIdx( RefSchemaTenantId,
				RefSchemaId );
	}

	public void deleteSchemaRefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		CFBamSchemaRefByPrevIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< CFBamSchemaRefByPrevIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict = indexByPrevIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<ICFBamSchemaRefObj> iter = dict.values().iterator();
			ICFBamSchemaRefObj obj;
			List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeSchemaRefByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteSchemaRefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		CFBamSchemaRefByNextIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< CFBamSchemaRefByNextIdxKey,
				Map< CFBamScopePKey, ICFBamSchemaRefObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamSchemaRefObj> dict = indexByNextIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<ICFBamSchemaRefObj> iter = dict.values().iterator();
			ICFBamSchemaRefObj obj;
			List<ICFBamSchemaRefObj> toForget = new LinkedList<ICFBamSchemaRefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().deleteSchemaRefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeSchemaRefByNextIdx( NextTenantId,
				NextId );
	}

	/**
	 *	Move the CFBamSchemaRefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamSchemaRefObj refreshed cache instance.
	 */
	public ICFBamSchemaRefObj moveUpSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveUpSchemaRef",
				"You cannot move an object that is being edited" );
		}
		CFBamSchemaRefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getSchemaRefTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamSchemaRefObj)obj.realise();
			ICFBamSchemaRefObj prev = obj.getOptionalLookupPrev( true );
			ICFBamSchemaRefObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				ICFBamSchemaRefObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the CFBamSchemaRefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamSchemaRefObj refreshed cache instance.
	 */
	public ICFBamSchemaRefObj moveDownSchemaRef( ICFBamSchemaRefObj Obj ) {
		ICFBamSchemaRefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new CFLibUsageException( getClass(),
				"moveDownSchemaRef",
				"You cannot move an object that is being edited" );
		}
		CFBamSchemaRefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaRef().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getSchemaRefTableObj().newInstance();
			obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			obj.setBuff( buff );
			obj = (ICFBamSchemaRefObj)obj.realise();
			ICFBamSchemaRefObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				ICFBamSchemaRefObj gprev = prev.getOptionalLookupPrev( true );
			}
			ICFBamSchemaRefObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}
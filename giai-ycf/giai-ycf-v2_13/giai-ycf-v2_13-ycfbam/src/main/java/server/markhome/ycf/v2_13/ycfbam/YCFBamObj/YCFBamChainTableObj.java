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

public class YCFBamChainTableObj
	implements IYCFBamChainTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamChainPKey, IYCFBamChainObj> members;
	private Map<YCFBamChainPKey, IYCFBamChainObj> allChain;
	private Map< YCFBamChainByTenantIdxKey,
		Map<YCFBamChainPKey, IYCFBamChainObj > > indexByTenantIdx;
	private Map< YCFBamChainByChainTableIdxKey,
		Map<YCFBamChainPKey, IYCFBamChainObj > > indexByChainTableIdx;
	private Map< YCFBamChainByDefSchemaIdxKey,
		Map<YCFBamChainPKey, IYCFBamChainObj > > indexByDefSchemaIdx;
	private Map< YCFBamChainByUNameIdxKey,
		IYCFBamChainObj > indexByUNameIdx;
	private Map< YCFBamChainByPrevRelIdxKey,
		Map<YCFBamChainPKey, IYCFBamChainObj > > indexByPrevRelIdx;
	private Map< YCFBamChainByNextRelIdxKey,
		Map<YCFBamChainPKey, IYCFBamChainObj > > indexByNextRelIdx;
	public static String TABLE_NAME = "Chain";
	public static String TABLE_DBNAME = "chain_def";

	public YCFBamChainTableObj() {
		schema = null;
		members = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
	}

	public YCFBamChainTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
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
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
		List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
		IYCFBamChainObj cur = null;
		Iterator<IYCFBamChainObj> iter = members.values().iterator();
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
	 *	YCFBamChainObj.
	 */
	public IYCFBamChainObj newInstance() {
		IYCFBamChainObj inst = new YCFBamChainObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamChainObj.
	 */
	public IYCFBamChainEditObj newEditInstance( IYCFBamChainObj orig ) {
		IYCFBamChainEditObj edit = new YCFBamChainEditObj( orig );
		return( edit );
	}

	public IYCFBamChainObj realiseChain( IYCFBamChainObj Obj ) {
		IYCFBamChainObj obj = Obj;
		YCFBamChainPKey pkey = obj.getPKey();
		IYCFBamChainObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamChainObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamChainByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByChainTableIdx != null ) {
				YCFBamChainByChainTableIdxKey keyChainTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.remove( keepObj.getPKey() );
					if( mapChainTableIdx.size() <= 0 ) {
						indexByChainTableIdx.remove( keyChainTableIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamChainByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByPrevRelIdx != null ) {
				YCFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.remove( keepObj.getPKey() );
					if( mapPrevRelIdx.size() <= 0 ) {
						indexByPrevRelIdx.remove( keyPrevRelIdx );
					}
				}
			}

			if( indexByNextRelIdx != null ) {
				YCFBamChainByNextRelIdxKey keyNextRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.remove( keepObj.getPKey() );
					if( mapNextRelIdx.size() <= 0 ) {
						indexByNextRelIdx.remove( keyNextRelIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamChainByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainTableIdx != null ) {
				YCFBamChainByChainTableIdxKey keyChainTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamChainByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevRelIdx != null ) {
				YCFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextRelIdx != null ) {
				YCFBamChainByNextRelIdxKey keyNextRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allChain != null ) {
				allChain.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allChain != null ) {
				allChain.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamChainByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainTableIdx != null ) {
				YCFBamChainByChainTableIdxKey keyChainTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamChainByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevRelIdx != null ) {
				YCFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextRelIdx != null ) {
				YCFBamChainByNextRelIdxKey keyNextRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<YCFBamChainPKey, IYCFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamChainObj createChain( IYCFBamChainObj Obj ) {
		IYCFBamChainObj obj = Obj;
		YCFBamChainBuff buff = obj.getChainBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableChain().createChain(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFBamChainObj readChain( YCFBamChainPKey pkey ) {
		return( readChain( pkey, false ) );
	}

	public IYCFBamChainObj readChain( YCFBamChainPKey pkey, boolean forceRead ) {
		IYCFBamChainObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamChainBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamChainObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamChainObj readCachedChain( YCFBamChainPKey pkey ) {
		IYCFBamChainObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeChain( IYCFBamChainObj obj )
	{
		final String S_ProcName = "YCFBamChainTableObj.reallyDeepDisposeChain() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamChainPKey pkey = obj.getPKey();
		IYCFBamChainObj existing = readCachedChain( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamChainByTenantIdxKey keyTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamChainByChainTableIdxKey keyChainTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		keyChainTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyChainTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamChainByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamChainByPrevRelIdxKey keyPrevRelIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		keyPrevRelIdx.setRequiredPrevRelationTenantId( existing.getRequiredPrevRelationTenantId() );
		keyPrevRelIdx.setRequiredPrevRelationId( existing.getRequiredPrevRelationId() );

		YCFBamChainByNextRelIdxKey keyNextRelIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		keyNextRelIdx.setRequiredNextRelationTenantId( existing.getRequiredNextRelationTenantId() );
		keyNextRelIdx.setRequiredNextRelationId( existing.getRequiredNextRelationId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByChainTableIdx != null ) {
			if( indexByChainTableIdx.containsKey( keyChainTableIdx ) ) {
				indexByChainTableIdx.get( keyChainTableIdx ).remove( pkey );
				if( indexByChainTableIdx.get( keyChainTableIdx ).size() <= 0 ) {
					indexByChainTableIdx.remove( keyChainTableIdx );
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

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByPrevRelIdx != null ) {
			if( indexByPrevRelIdx.containsKey( keyPrevRelIdx ) ) {
				indexByPrevRelIdx.get( keyPrevRelIdx ).remove( pkey );
				if( indexByPrevRelIdx.get( keyPrevRelIdx ).size() <= 0 ) {
					indexByPrevRelIdx.remove( keyPrevRelIdx );
				}
			}
		}

		if( indexByNextRelIdx != null ) {
			if( indexByNextRelIdx.containsKey( keyNextRelIdx ) ) {
				indexByNextRelIdx.get( keyNextRelIdx ).remove( pkey );
				if( indexByNextRelIdx.get( keyNextRelIdx ).size() <= 0 ) {
					indexByNextRelIdx.remove( keyNextRelIdx );
				}
			}
		}


	}
	public void deepDisposeChain( YCFBamChainPKey pkey ) {
		IYCFBamChainObj obj = readCachedChain( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamChainObj lockChain( YCFBamChainPKey pkey ) {
		IYCFBamChainObj locked = null;
		YCFBamChainBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getChainTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamChainObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockChain", pkey );
		}
		return( locked );
	}

	public List<IYCFBamChainObj> readAllChain() {
		return( readAllChain( false ) );
	}

	public List<IYCFBamChainObj> readAllChain( boolean forceRead ) {
		final String S_ProcName = "readAllChain";
		if( ( allChain == null ) || forceRead ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> map = new HashMap<YCFBamChainPKey,IYCFBamChainObj>();
			allChain = map;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readAllDerived( schema.getAuthorization() );
			YCFBamChainBuff buff;
			IYCFBamChainObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
			}
		}
		int len = allChain.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = allChain.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamChainObj> readCachedAllChain() {
		final String S_ProcName = "readCachedAllChain";
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( allChain != null ) {
			int len = allChain.size();
			IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
			Iterator<IYCFBamChainObj> valIter = allChain.values().iterator();
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
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamChainObj readChainByIdIdx( long TenantId,
		long Id )
	{
		return( readChainByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamChainObj readChainByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamChainPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamChainObj obj = readChain( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamChainObj> readChainByTenantIdx( long TenantId )
	{
		return( readChainByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamChainObj> readChainByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByTenantIdx";
		YCFBamChainByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamChainPKey, IYCFBamChainObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamChainByTenantIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
			IYCFBamChainObj obj;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId )
	{
		return( readChainByChainTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByChainTableIdx";
		YCFBamChainByChainTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamChainPKey, IYCFBamChainObj> dict;
		if( indexByChainTableIdx == null ) {
			indexByChainTableIdx = new HashMap< YCFBamChainByChainTableIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByChainTableIdx.containsKey( key ) ) {
			dict = indexByChainTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
			IYCFBamChainObj obj;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readChainByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByDefSchemaIdx";
		YCFBamChainByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamChainPKey, IYCFBamChainObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamChainByDefSchemaIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
			IYCFBamChainObj obj;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamChainObj readChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readChainByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamChainObj readChainByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamChainByUNameIdxKey,
				IYCFBamChainObj >();
		}
		YCFBamChainByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamChainObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamChainBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamChainObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		return( readChainByPrevRelIdx( PrevRelationTenantId,
			PrevRelationId,
			false ) );
	}

	public List<IYCFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByPrevRelIdx";
		YCFBamChainByPrevRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		Map<YCFBamChainPKey, IYCFBamChainObj> dict;
		if( indexByPrevRelIdx == null ) {
			indexByPrevRelIdx = new HashMap< YCFBamChainByPrevRelIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByPrevRelIdx.containsKey( key ) ) {
			dict = indexByPrevRelIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
			IYCFBamChainObj obj;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
			YCFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevRelIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		return( readChainByNextRelIdx( NextRelationTenantId,
			NextRelationId,
			false ) );
	}

	public List<IYCFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByNextRelIdx";
		YCFBamChainByNextRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		Map<YCFBamChainPKey, IYCFBamChainObj> dict;
		if( indexByNextRelIdx == null ) {
			indexByNextRelIdx = new HashMap< YCFBamChainByNextRelIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByNextRelIdx.containsKey( key ) ) {
			dict = indexByNextRelIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamChainPKey, IYCFBamChainObj>();
			IYCFBamChainObj obj;
			YCFBamChainBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
			YCFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				IYCFBamChainObj realised = (IYCFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextRelIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
		Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamChainObj readCachedChainByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamChainObj obj = null;
		YCFBamChainPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedChain( pkey );
		return( obj );
	}

	public List<IYCFBamChainObj> readCachedChainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedChainByTenantIdx";
		YCFBamChainByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
				Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
			IYCFBamChainObj obj;
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamChainObj> readCachedChainByChainTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedChainByChainTableIdx";
		YCFBamChainByChainTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( indexByChainTableIdx != null ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict;
			if( indexByChainTableIdx.containsKey( key ) ) {
				dict = indexByChainTableIdx.get( key );
				int len = dict.size();
				IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
				Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
			IYCFBamChainObj obj;
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamChainObj> readCachedChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedChainByDefSchemaIdx";
		YCFBamChainByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
				Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
			IYCFBamChainObj obj;
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamChainObj readCachedChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamChainObj obj = null;
		YCFBamChainByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamChainObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
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

	public List<IYCFBamChainObj> readCachedChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "readCachedChainByPrevRelIdx";
		YCFBamChainByPrevRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( indexByPrevRelIdx != null ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict;
			if( indexByPrevRelIdx.containsKey( key ) ) {
				dict = indexByPrevRelIdx.get( key );
				int len = dict.size();
				IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
				Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
			IYCFBamChainObj obj;
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamChainObj> readCachedChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "readCachedChainByNextRelIdx";
		YCFBamChainByNextRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		ArrayList<IYCFBamChainObj> arrayList = new ArrayList<IYCFBamChainObj>();
		if( indexByNextRelIdx != null ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict;
			if( indexByNextRelIdx.containsKey( key ) ) {
				dict = indexByNextRelIdx.get( key );
				int len = dict.size();
				IYCFBamChainObj arr[] = new IYCFBamChainObj[len];
				Iterator<IYCFBamChainObj> valIter = dict.values().iterator();
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
			IYCFBamChainObj obj;
			Iterator<IYCFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamChainObj> cmp = new Comparator<IYCFBamChainObj>() {
			public int compare( IYCFBamChainObj lhs, IYCFBamChainObj rhs ) {
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
					YCFBamChainPKey lhsPKey = lhs.getPKey();
					YCFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeChainByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamChainObj obj = readCachedChainByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeChainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeChainByTenantIdx";
		IYCFBamChainObj obj;
		List<IYCFBamChainObj> arrayList = readCachedChainByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByChainTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeChainByChainTableIdx";
		IYCFBamChainObj obj;
		List<IYCFBamChainObj> arrayList = readCachedChainByChainTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeChainByDefSchemaIdx";
		IYCFBamChainObj obj;
		List<IYCFBamChainObj> arrayList = readCachedChainByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamChainObj obj = readCachedChainByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "deepDisposeChainByPrevRelIdx";
		IYCFBamChainObj obj;
		List<IYCFBamChainObj> arrayList = readCachedChainByPrevRelIdx( PrevRelationTenantId,
				PrevRelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "deepDisposeChainByNextRelIdx";
		IYCFBamChainObj obj;
		List<IYCFBamChainObj> arrayList = readCachedChainByNextRelIdx( NextRelationTenantId,
				NextRelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamChainObj updateChain( IYCFBamChainObj Obj ) {
		IYCFBamChainObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableChain().updateChain( schema.getAuthorization(),
			Obj.getChainBuff() );
		obj = (IYCFBamChainObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteChain( IYCFBamChainObj Obj ) {
		IYCFBamChainObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChain( schema.getAuthorization(),
			obj.getChainBuff() );
		Obj.forget();
	}

	public void deleteChainByIdIdx( long TenantId,
		long Id )
	{
		YCFBamChainPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamChainObj obj = readChain( pkey );
		if( obj != null ) {
			IYCFBamChainEditObj editObj = (IYCFBamChainEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamChainEditObj)obj.beginEdit();
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
		deepDisposeChainByIdIdx( TenantId,
				Id );
	}

	public void deleteChainByTenantIdx( long TenantId )
	{
		YCFBamChainByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamChainByTenantIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamChainObj> iter = dict.values().iterator();
			IYCFBamChainObj obj;
			List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeChainByTenantIdx( TenantId );
	}

	public void deleteChainByChainTableIdx( long TenantId,
		long TableId )
	{
		YCFBamChainByChainTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByChainTableIdx == null ) {
			indexByChainTableIdx = new HashMap< YCFBamChainByChainTableIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( indexByChainTableIdx.containsKey( key ) ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict = indexByChainTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamChainObj> iter = dict.values().iterator();
			IYCFBamChainObj obj;
			List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByChainTableIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeChainByChainTableIdx( TenantId,
				TableId );
	}

	public void deleteChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamChainByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamChainByDefSchemaIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamChainObj> iter = dict.values().iterator();
			IYCFBamChainObj obj;
			List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeChainByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamChainByUNameIdxKey,
				IYCFBamChainObj >();
		}
		YCFBamChainByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamChainObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeChainByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		YCFBamChainByPrevRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		if( indexByPrevRelIdx == null ) {
			indexByPrevRelIdx = new HashMap< YCFBamChainByPrevRelIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( indexByPrevRelIdx.containsKey( key ) ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict = indexByPrevRelIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
			Iterator<IYCFBamChainObj> iter = dict.values().iterator();
			IYCFBamChainObj obj;
			List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevRelIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
		}
		deepDisposeChainByPrevRelIdx( PrevRelationTenantId,
				PrevRelationId );
	}

	public void deleteChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		YCFBamChainByNextRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		if( indexByNextRelIdx == null ) {
			indexByNextRelIdx = new HashMap< YCFBamChainByNextRelIdxKey,
				Map< YCFBamChainPKey, IYCFBamChainObj > >();
		}
		if( indexByNextRelIdx.containsKey( key ) ) {
			Map<YCFBamChainPKey, IYCFBamChainObj> dict = indexByNextRelIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
			Iterator<IYCFBamChainObj> iter = dict.values().iterator();
			IYCFBamChainObj obj;
			List<IYCFBamChainObj> toForget = new LinkedList<IYCFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextRelIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
		}
		deepDisposeChainByNextRelIdx( NextRelationTenantId,
				NextRelationId );
	}
}

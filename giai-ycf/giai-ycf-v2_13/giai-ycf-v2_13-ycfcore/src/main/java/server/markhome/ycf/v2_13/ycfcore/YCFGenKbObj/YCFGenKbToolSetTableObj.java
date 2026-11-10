// Description: Java 11 Table Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbToolSetTableObj
	implements IYCFGenKbToolSetTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> members;
	private Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> allToolSet;
	private Map< YCFGenKbToolSetByNameIdxKey,
		IYCFGenKbToolSetObj > indexByNameIdx;
	private Map< YCFGenKbToolSetByTool0IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool0Idx;
	private Map< YCFGenKbToolSetByTool1IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool1Idx;
	private Map< YCFGenKbToolSetByTool2IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool2Idx;
	private Map< YCFGenKbToolSetByTool3IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool3Idx;
	private Map< YCFGenKbToolSetByTool4IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool4Idx;
	private Map< YCFGenKbToolSetByTool5IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool5Idx;
	private Map< YCFGenKbToolSetByTool6IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool6Idx;
	private Map< YCFGenKbToolSetByTool7IdxKey,
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > > indexByTool7Idx;
	public static String TABLE_NAME = "ToolSet";
	public static String TABLE_DBNAME = "kbtoolset";

	public YCFGenKbToolSetTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
	}

	public YCFGenKbToolSetTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = (IYCFGenKbSchemaObj)value;
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
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
		List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
		IYCFGenKbToolSetObj cur = null;
		Iterator<IYCFGenKbToolSetObj> iter = members.values().iterator();
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
	 *	YCFGenKbToolSetObj.
	 */
	public IYCFGenKbToolSetObj newInstance() {
		IYCFGenKbToolSetObj inst = new YCFGenKbToolSetObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbToolSetObj.
	 */
	public IYCFGenKbToolSetEditObj newEditInstance( IYCFGenKbToolSetObj orig ) {
		IYCFGenKbToolSetEditObj edit = new YCFGenKbToolSetEditObj( orig );
		return( edit );
	}

	public IYCFGenKbToolSetObj realiseToolSet( IYCFGenKbToolSetObj Obj ) {
		IYCFGenKbToolSetObj obj = Obj;
		YCFGenKbToolSetPKey pkey = obj.getPKey();
		IYCFGenKbToolSetObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbToolSetObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFGenKbToolSetByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByTool0Idx != null ) {
				YCFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.remove( keepObj.getPKey() );
					if( mapTool0Idx.size() <= 0 ) {
						indexByTool0Idx.remove( keyTool0Idx );
					}
				}
			}

			if( indexByTool1Idx != null ) {
				YCFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.remove( keepObj.getPKey() );
					if( mapTool1Idx.size() <= 0 ) {
						indexByTool1Idx.remove( keyTool1Idx );
					}
				}
			}

			if( indexByTool2Idx != null ) {
				YCFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.remove( keepObj.getPKey() );
					if( mapTool2Idx.size() <= 0 ) {
						indexByTool2Idx.remove( keyTool2Idx );
					}
				}
			}

			if( indexByTool3Idx != null ) {
				YCFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.remove( keepObj.getPKey() );
					if( mapTool3Idx.size() <= 0 ) {
						indexByTool3Idx.remove( keyTool3Idx );
					}
				}
			}

			if( indexByTool4Idx != null ) {
				YCFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.remove( keepObj.getPKey() );
					if( mapTool4Idx.size() <= 0 ) {
						indexByTool4Idx.remove( keyTool4Idx );
					}
				}
			}

			if( indexByTool5Idx != null ) {
				YCFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.remove( keepObj.getPKey() );
					if( mapTool5Idx.size() <= 0 ) {
						indexByTool5Idx.remove( keyTool5Idx );
					}
				}
			}

			if( indexByTool6Idx != null ) {
				YCFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.remove( keepObj.getPKey() );
					if( mapTool6Idx.size() <= 0 ) {
						indexByTool6Idx.remove( keyTool6Idx );
					}
				}
			}

			if( indexByTool7Idx != null ) {
				YCFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.remove( keepObj.getPKey() );
					if( mapTool7Idx.size() <= 0 ) {
						indexByTool7Idx.remove( keyTool7Idx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFGenKbToolSetByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByTool0Idx != null ) {
				YCFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool1Idx != null ) {
				YCFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool2Idx != null ) {
				YCFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool3Idx != null ) {
				YCFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool4Idx != null ) {
				YCFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool5Idx != null ) {
				YCFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool6Idx != null ) {
				YCFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool7Idx != null ) {
				YCFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allToolSet != null ) {
				allToolSet.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allToolSet != null ) {
				allToolSet.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFGenKbToolSetByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByTool0Idx != null ) {
				YCFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool1Idx != null ) {
				YCFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool2Idx != null ) {
				YCFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool3Idx != null ) {
				YCFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool4Idx != null ) {
				YCFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool5Idx != null ) {
				YCFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool6Idx != null ) {
				YCFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool7Idx != null ) {
				YCFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbToolSetObj createToolSet( IYCFGenKbToolSetObj Obj ) {
		IYCFGenKbToolSetObj obj = Obj;
		YCFGenKbToolSetBuff buff = obj.getToolSetBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().createToolSet(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbToolSetObj readToolSet( YCFGenKbToolSetPKey pkey ) {
		return( readToolSet( pkey, false ) );
	}

	public IYCFGenKbToolSetObj readToolSet( YCFGenKbToolSetPKey pkey, boolean forceRead ) {
		IYCFGenKbToolSetObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbToolSetBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbToolSetObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbToolSetObj readCachedToolSet( YCFGenKbToolSetPKey pkey ) {
		IYCFGenKbToolSetObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeToolSet( IYCFGenKbToolSetObj obj )
	{
		final String S_ProcName = "YCFGenKbToolSetTableObj.reallyDeepDisposeToolSet() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbToolSetPKey pkey = obj.getPKey();
		IYCFGenKbToolSetObj existing = readCachedToolSet( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbToolSetByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolSetByTool0IdxKey keyTool0Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		keyTool0Idx.setRequiredToolId0( existing.getRequiredToolId0() );

		YCFGenKbToolSetByTool1IdxKey keyTool1Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		keyTool1Idx.setOptionalToolId1( existing.getOptionalToolId1() );

		YCFGenKbToolSetByTool2IdxKey keyTool2Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		keyTool2Idx.setOptionalToolId2( existing.getOptionalToolId2() );

		YCFGenKbToolSetByTool3IdxKey keyTool3Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		keyTool3Idx.setOptionalToolId3( existing.getOptionalToolId3() );

		YCFGenKbToolSetByTool4IdxKey keyTool4Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		keyTool4Idx.setOptionalToolId4( existing.getOptionalToolId4() );

		YCFGenKbToolSetByTool5IdxKey keyTool5Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		keyTool5Idx.setOptionalToolId5( existing.getOptionalToolId5() );

		YCFGenKbToolSetByTool6IdxKey keyTool6Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		keyTool6Idx.setOptionalToolId6( existing.getOptionalToolId6() );

		YCFGenKbToolSetByTool7IdxKey keyTool7Idx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		keyTool7Idx.setOptionalToolId7( existing.getOptionalToolId7() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByTool0Idx != null ) {
			if( indexByTool0Idx.containsKey( keyTool0Idx ) ) {
				indexByTool0Idx.get( keyTool0Idx ).remove( pkey );
				if( indexByTool0Idx.get( keyTool0Idx ).size() <= 0 ) {
					indexByTool0Idx.remove( keyTool0Idx );
				}
			}
		}

		if( indexByTool1Idx != null ) {
			if( indexByTool1Idx.containsKey( keyTool1Idx ) ) {
				indexByTool1Idx.get( keyTool1Idx ).remove( pkey );
				if( indexByTool1Idx.get( keyTool1Idx ).size() <= 0 ) {
					indexByTool1Idx.remove( keyTool1Idx );
				}
			}
		}

		if( indexByTool2Idx != null ) {
			if( indexByTool2Idx.containsKey( keyTool2Idx ) ) {
				indexByTool2Idx.get( keyTool2Idx ).remove( pkey );
				if( indexByTool2Idx.get( keyTool2Idx ).size() <= 0 ) {
					indexByTool2Idx.remove( keyTool2Idx );
				}
			}
		}

		if( indexByTool3Idx != null ) {
			if( indexByTool3Idx.containsKey( keyTool3Idx ) ) {
				indexByTool3Idx.get( keyTool3Idx ).remove( pkey );
				if( indexByTool3Idx.get( keyTool3Idx ).size() <= 0 ) {
					indexByTool3Idx.remove( keyTool3Idx );
				}
			}
		}

		if( indexByTool4Idx != null ) {
			if( indexByTool4Idx.containsKey( keyTool4Idx ) ) {
				indexByTool4Idx.get( keyTool4Idx ).remove( pkey );
				if( indexByTool4Idx.get( keyTool4Idx ).size() <= 0 ) {
					indexByTool4Idx.remove( keyTool4Idx );
				}
			}
		}

		if( indexByTool5Idx != null ) {
			if( indexByTool5Idx.containsKey( keyTool5Idx ) ) {
				indexByTool5Idx.get( keyTool5Idx ).remove( pkey );
				if( indexByTool5Idx.get( keyTool5Idx ).size() <= 0 ) {
					indexByTool5Idx.remove( keyTool5Idx );
				}
			}
		}

		if( indexByTool6Idx != null ) {
			if( indexByTool6Idx.containsKey( keyTool6Idx ) ) {
				indexByTool6Idx.get( keyTool6Idx ).remove( pkey );
				if( indexByTool6Idx.get( keyTool6Idx ).size() <= 0 ) {
					indexByTool6Idx.remove( keyTool6Idx );
				}
			}
		}

		if( indexByTool7Idx != null ) {
			if( indexByTool7Idx.containsKey( keyTool7Idx ) ) {
				indexByTool7Idx.get( keyTool7Idx ).remove( pkey );
				if( indexByTool7Idx.get( keyTool7Idx ).size() <= 0 ) {
					indexByTool7Idx.remove( keyTool7Idx );
				}
			}
		}


	}
	public void deepDisposeToolSet( YCFGenKbToolSetPKey pkey ) {
		IYCFGenKbToolSetObj obj = readCachedToolSet( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbToolSetObj lockToolSet( YCFGenKbToolSetPKey pkey ) {
		IYCFGenKbToolSetObj locked = null;
		YCFGenKbToolSetBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getToolSetTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbToolSetObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockToolSet", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbToolSetObj> readAllToolSet() {
		return( readAllToolSet( false ) );
	}

	public List<IYCFGenKbToolSetObj> readAllToolSet( boolean forceRead ) {
		final String S_ProcName = "readAllToolSet";
		if( ( allToolSet == null ) || forceRead ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> map = new HashMap<YCFGenKbToolSetPKey,IYCFGenKbToolSetObj>();
			allToolSet = map;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readAllDerived( schema.getAuthorization() );
			YCFGenKbToolSetBuff buff;
			IYCFGenKbToolSetObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
			}
		}
		int len = allToolSet.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = allToolSet.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readCachedAllToolSet() {
		final String S_ProcName = "readCachedAllToolSet";
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( allToolSet != null ) {
			int len = allToolSet.size();
			IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
			Iterator<IYCFGenKbToolSetObj> valIter = allToolSet.values().iterator();
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
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbToolSetObj readToolSetByIdIdx( short Id )
	{
		return( readToolSetByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbToolSetObj readToolSetByIdIdx( short Id, boolean forceRead )
	{
		YCFGenKbToolSetPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbToolSetObj obj = readToolSet( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbToolSetObj readToolSetByNameIdx( String Name )
	{
		return( readToolSetByNameIdx( Name,
			false ) );
	}

	public IYCFGenKbToolSetObj readToolSetByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbToolSetByNameIdxKey,
				IYCFGenKbToolSetObj >();
		}
		YCFGenKbToolSetByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbToolSetObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbToolSetBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbToolSetObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0 )
	{
		return( readToolSetByTool0Idx( ToolId0,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool0Idx";
		YCFGenKbToolSetByTool0IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool0Idx == null ) {
			indexByTool0Idx = new HashMap< YCFGenKbToolSetByTool0IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool0Idx.containsKey( key ) ) {
			dict = indexByTool0Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool0Idx( schema.getAuthorization(),
				ToolId0 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool0Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1 )
	{
		return( readToolSetByTool1Idx( ToolId1,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool1Idx";
		YCFGenKbToolSetByTool1IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool1Idx == null ) {
			indexByTool1Idx = new HashMap< YCFGenKbToolSetByTool1IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool1Idx.containsKey( key ) ) {
			dict = indexByTool1Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool1Idx( schema.getAuthorization(),
				ToolId1 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool1Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2 )
	{
		return( readToolSetByTool2Idx( ToolId2,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool2Idx";
		YCFGenKbToolSetByTool2IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool2Idx == null ) {
			indexByTool2Idx = new HashMap< YCFGenKbToolSetByTool2IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool2Idx.containsKey( key ) ) {
			dict = indexByTool2Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool2Idx( schema.getAuthorization(),
				ToolId2 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool2Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3 )
	{
		return( readToolSetByTool3Idx( ToolId3,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool3Idx";
		YCFGenKbToolSetByTool3IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool3Idx == null ) {
			indexByTool3Idx = new HashMap< YCFGenKbToolSetByTool3IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool3Idx.containsKey( key ) ) {
			dict = indexByTool3Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool3Idx( schema.getAuthorization(),
				ToolId3 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool3Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4 )
	{
		return( readToolSetByTool4Idx( ToolId4,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool4Idx";
		YCFGenKbToolSetByTool4IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool4Idx == null ) {
			indexByTool4Idx = new HashMap< YCFGenKbToolSetByTool4IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool4Idx.containsKey( key ) ) {
			dict = indexByTool4Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool4Idx( schema.getAuthorization(),
				ToolId4 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool4Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5 )
	{
		return( readToolSetByTool5Idx( ToolId5,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool5Idx";
		YCFGenKbToolSetByTool5IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool5Idx == null ) {
			indexByTool5Idx = new HashMap< YCFGenKbToolSetByTool5IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool5Idx.containsKey( key ) ) {
			dict = indexByTool5Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool5Idx( schema.getAuthorization(),
				ToolId5 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool5Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6 )
	{
		return( readToolSetByTool6Idx( ToolId6,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool6Idx";
		YCFGenKbToolSetByTool6IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool6Idx == null ) {
			indexByTool6Idx = new HashMap< YCFGenKbToolSetByTool6IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool6Idx.containsKey( key ) ) {
			dict = indexByTool6Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool6Idx( schema.getAuthorization(),
				ToolId6 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool6Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7 )
	{
		return( readToolSetByTool7Idx( ToolId7,
			false ) );
	}

	public List<IYCFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool7Idx";
		YCFGenKbToolSetByTool7IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
		if( indexByTool7Idx == null ) {
			indexByTool7Idx = new HashMap< YCFGenKbToolSetByTool7IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool7Idx.containsKey( key ) ) {
			dict = indexByTool7Idx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj>();
			IYCFGenKbToolSetObj obj;
			YCFGenKbToolSetBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool7Idx( schema.getAuthorization(),
				ToolId7 );
			YCFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolSetObj realised = (IYCFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool7Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
		Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbToolSetObj readCachedToolSetByIdIdx( short Id )
	{
		IYCFGenKbToolSetObj obj = null;
		YCFGenKbToolSetPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedToolSet( pkey );
		return( obj );
	}

	public IYCFGenKbToolSetObj readCachedToolSetByNameIdx( String Name )
	{
		IYCFGenKbToolSetObj obj = null;
		YCFGenKbToolSetByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool0Idx( short ToolId0 )
	{
		final String S_ProcName = "readCachedToolSetByTool0Idx";
		YCFGenKbToolSetByTool0IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool0Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool0Idx.containsKey( key ) ) {
				dict = indexByTool0Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool1Idx( Short ToolId1 )
	{
		final String S_ProcName = "readCachedToolSetByTool1Idx";
		YCFGenKbToolSetByTool1IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool1Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool1Idx.containsKey( key ) ) {
				dict = indexByTool1Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool2Idx( Short ToolId2 )
	{
		final String S_ProcName = "readCachedToolSetByTool2Idx";
		YCFGenKbToolSetByTool2IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool2Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool2Idx.containsKey( key ) ) {
				dict = indexByTool2Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool3Idx( Short ToolId3 )
	{
		final String S_ProcName = "readCachedToolSetByTool3Idx";
		YCFGenKbToolSetByTool3IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool3Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool3Idx.containsKey( key ) ) {
				dict = indexByTool3Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool4Idx( Short ToolId4 )
	{
		final String S_ProcName = "readCachedToolSetByTool4Idx";
		YCFGenKbToolSetByTool4IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool4Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool4Idx.containsKey( key ) ) {
				dict = indexByTool4Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool5Idx( Short ToolId5 )
	{
		final String S_ProcName = "readCachedToolSetByTool5Idx";
		YCFGenKbToolSetByTool5IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool5Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool5Idx.containsKey( key ) ) {
				dict = indexByTool5Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool6Idx( Short ToolId6 )
	{
		final String S_ProcName = "readCachedToolSetByTool6Idx";
		YCFGenKbToolSetByTool6IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool6Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool6Idx.containsKey( key ) ) {
				dict = indexByTool6Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbToolSetObj> readCachedToolSetByTool7Idx( Short ToolId7 )
	{
		final String S_ProcName = "readCachedToolSetByTool7Idx";
		YCFGenKbToolSetByTool7IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		ArrayList<IYCFGenKbToolSetObj> arrayList = new ArrayList<IYCFGenKbToolSetObj>();
		if( indexByTool7Idx != null ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict;
			if( indexByTool7Idx.containsKey( key ) ) {
				dict = indexByTool7Idx.get( key );
				int len = dict.size();
				IYCFGenKbToolSetObj arr[] = new IYCFGenKbToolSetObj[len];
				Iterator<IYCFGenKbToolSetObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolSetObj obj;
			Iterator<IYCFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolSetObj> cmp = new Comparator<IYCFGenKbToolSetObj>() {
			public int compare( IYCFGenKbToolSetObj lhs, IYCFGenKbToolSetObj rhs ) {
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
					YCFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeToolSetByIdIdx( short Id )
	{
		IYCFGenKbToolSetObj obj = readCachedToolSetByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolSetByNameIdx( String Name )
	{
		IYCFGenKbToolSetObj obj = readCachedToolSetByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolSetByTool0Idx( short ToolId0 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool0Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool0Idx( ToolId0 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool1Idx( Short ToolId1 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool1Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool1Idx( ToolId1 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool2Idx( Short ToolId2 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool2Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool2Idx( ToolId2 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool3Idx( Short ToolId3 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool3Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool3Idx( ToolId3 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool4Idx( Short ToolId4 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool4Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool4Idx( ToolId4 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool5Idx( Short ToolId5 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool5Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool5Idx( ToolId5 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool6Idx( Short ToolId6 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool6Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool6Idx( ToolId6 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool7Idx( Short ToolId7 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool7Idx";
		IYCFGenKbToolSetObj obj;
		List<IYCFGenKbToolSetObj> arrayList = readCachedToolSetByTool7Idx( ToolId7 );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbToolSetObj updateToolSet( IYCFGenKbToolSetObj Obj ) {
		IYCFGenKbToolSetObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().updateToolSet( schema.getAuthorization(),
			Obj.getToolSetBuff() );
		obj = (IYCFGenKbToolSetObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteToolSet( IYCFGenKbToolSetObj Obj ) {
		IYCFGenKbToolSetObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSet( schema.getAuthorization(),
			obj.getToolSetBuff() );
		Obj.forget();
	}

	public void deleteToolSetByIdIdx( short Id )
	{
		YCFGenKbToolSetPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbToolSetObj obj = readToolSet( pkey );
		if( obj != null ) {
			IYCFGenKbToolSetEditObj editObj = (IYCFGenKbToolSetEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbToolSetEditObj)obj.beginEdit();
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
		deepDisposeToolSetByIdIdx( Id );
	}

	public void deleteToolSetByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbToolSetByNameIdxKey,
				IYCFGenKbToolSetObj >();
		}
		YCFGenKbToolSetByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbToolSetObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeToolSetByNameIdx( Name );
	}

	public void deleteToolSetByTool0Idx( short ToolId0 )
	{
		YCFGenKbToolSetByTool0IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		if( indexByTool0Idx == null ) {
			indexByTool0Idx = new HashMap< YCFGenKbToolSetByTool0IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool0Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool0Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool0Idx( schema.getAuthorization(),
				ToolId0 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool0Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool0Idx( schema.getAuthorization(),
				ToolId0 );
		}
		deepDisposeToolSetByTool0Idx( ToolId0 );
	}

	public void deleteToolSetByTool1Idx( Short ToolId1 )
	{
		YCFGenKbToolSetByTool1IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		if( indexByTool1Idx == null ) {
			indexByTool1Idx = new HashMap< YCFGenKbToolSetByTool1IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool1Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool1Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool1Idx( schema.getAuthorization(),
				ToolId1 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool1Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool1Idx( schema.getAuthorization(),
				ToolId1 );
		}
		deepDisposeToolSetByTool1Idx( ToolId1 );
	}

	public void deleteToolSetByTool2Idx( Short ToolId2 )
	{
		YCFGenKbToolSetByTool2IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		if( indexByTool2Idx == null ) {
			indexByTool2Idx = new HashMap< YCFGenKbToolSetByTool2IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool2Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool2Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool2Idx( schema.getAuthorization(),
				ToolId2 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool2Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool2Idx( schema.getAuthorization(),
				ToolId2 );
		}
		deepDisposeToolSetByTool2Idx( ToolId2 );
	}

	public void deleteToolSetByTool3Idx( Short ToolId3 )
	{
		YCFGenKbToolSetByTool3IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		if( indexByTool3Idx == null ) {
			indexByTool3Idx = new HashMap< YCFGenKbToolSetByTool3IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool3Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool3Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool3Idx( schema.getAuthorization(),
				ToolId3 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool3Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool3Idx( schema.getAuthorization(),
				ToolId3 );
		}
		deepDisposeToolSetByTool3Idx( ToolId3 );
	}

	public void deleteToolSetByTool4Idx( Short ToolId4 )
	{
		YCFGenKbToolSetByTool4IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		if( indexByTool4Idx == null ) {
			indexByTool4Idx = new HashMap< YCFGenKbToolSetByTool4IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool4Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool4Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool4Idx( schema.getAuthorization(),
				ToolId4 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool4Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool4Idx( schema.getAuthorization(),
				ToolId4 );
		}
		deepDisposeToolSetByTool4Idx( ToolId4 );
	}

	public void deleteToolSetByTool5Idx( Short ToolId5 )
	{
		YCFGenKbToolSetByTool5IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		if( indexByTool5Idx == null ) {
			indexByTool5Idx = new HashMap< YCFGenKbToolSetByTool5IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool5Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool5Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool5Idx( schema.getAuthorization(),
				ToolId5 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool5Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool5Idx( schema.getAuthorization(),
				ToolId5 );
		}
		deepDisposeToolSetByTool5Idx( ToolId5 );
	}

	public void deleteToolSetByTool6Idx( Short ToolId6 )
	{
		YCFGenKbToolSetByTool6IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		if( indexByTool6Idx == null ) {
			indexByTool6Idx = new HashMap< YCFGenKbToolSetByTool6IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool6Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool6Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool6Idx( schema.getAuthorization(),
				ToolId6 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool6Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool6Idx( schema.getAuthorization(),
				ToolId6 );
		}
		deepDisposeToolSetByTool6Idx( ToolId6 );
	}

	public void deleteToolSetByTool7Idx( Short ToolId7 )
	{
		YCFGenKbToolSetByTool7IdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		if( indexByTool7Idx == null ) {
			indexByTool7Idx = new HashMap< YCFGenKbToolSetByTool7IdxKey,
				Map< YCFGenKbToolSetPKey, IYCFGenKbToolSetObj > >();
		}
		if( indexByTool7Idx.containsKey( key ) ) {
			Map<YCFGenKbToolSetPKey, IYCFGenKbToolSetObj> dict = indexByTool7Idx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool7Idx( schema.getAuthorization(),
				ToolId7 );
			Iterator<IYCFGenKbToolSetObj> iter = dict.values().iterator();
			IYCFGenKbToolSetObj obj;
			List<IYCFGenKbToolSetObj> toForget = new LinkedList<IYCFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool7Idx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool7Idx( schema.getAuthorization(),
				ToolId7 );
		}
		deepDisposeToolSetByTool7Idx( ToolId7 );
	}
}

// Description: Java 11 base object instance implementation for YCFGenKb GelSpread.

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
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;

public class YCFGenKbGelSpreadObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelSpreadObj
{
	public final static String CLASS_CODE = "a918";

	public YCFGenKbGelSpreadObj() {
		super();
	}

	public YCFGenKbGelSpreadObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSpread" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
		objName = Long.toString( val );
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFGenKbGelInstructionObj realise() {
		IYCFGenKbGelSpreadObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().realiseGelSpread(
			(IYCFGenKbGelSpreadObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().reallyDeepDisposeGelSpread( (IYCFGenKbGelSpreadObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelSpreadObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().readGelSpreadByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelSpreadObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().readGelSpreadByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelSpreadTableObj getGelSpreadTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSpread().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSpread().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelSpreadBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelSpreadBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public YCFGenKbGelSpreadBuff getGelSpreadBuff() {
		return( (YCFGenKbGelSpreadBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelSpreadObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelSpreadObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().lockGelSpread( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelSpreadTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelSpreadEditObj getEditAsGelSpread() {
		return( (IYCFGenKbGelSpreadEditObj)edit );
	}

	public String getRequiredIteratorName() {
		return( getGelSpreadBuff().getRequiredIteratorName() );
	}

	public String getOptionalExpandBetween() {
		return( getGelSpreadBuff().getOptionalExpandBetween() );
	}

	public String getOptionalExpandBefore() {
		return( getGelSpreadBuff().getOptionalExpandBefore() );
	}

	public String getOptionalExpandFirst() {
		return( getGelSpreadBuff().getOptionalExpandFirst() );
	}

	public String getRequiredExpandEach() {
		return( getGelSpreadBuff().getRequiredExpandEach() );
	}

	public String getOptionalExpandLast() {
		return( getGelSpreadBuff().getOptionalExpandLast() );
	}

	public String getOptionalExpandLone() {
		return( getGelSpreadBuff().getOptionalExpandLone() );
	}

	public String getOptionalExpandEmpty() {
		return( getGelSpreadBuff().getOptionalExpandEmpty() );
	}

	public String getOptionalExpandAfter() {
		return( getGelSpreadBuff().getOptionalExpandAfter() );
	}

	public String expand( MssYCFGenContext genContext ) {
		String					itemExpansion = null;
		IYCFLibAnyObj			detailDef = null;
		MssYCFGenContext			detailContext = null;
		int						idx;
		int						numItems = 0;
		int						totalItems = 0;
		List<IYCFLibAnyObj>		detailList;

		IYCFGenKbGenItemObj		itemBetween = null;
		IYCFGenKbGenItemObj		itemBefore = null;
		IYCFGenKbGenItemObj		itemAfter = null;
		IYCFGenKbGenItemObj		itemEmpty = null;

		IYCFGenKbGenItemObj		itemRule = null;

		String					failedBetween = null;
		String					failedBefore = null;
		String					failedFirst = null;
		String					failedEach = null;
		String					failedLast = null;
		String					failedAfter = null;
		String					failedLone = null;
		String					failedEmpty = null;

		String					expansion = null;
		MssYCFGenContext			subContext = null;

		final String S_ProcName = "YCFGenKbGelSpreadObj.expand() ";

		String				iteratorName = getRequiredIteratorName();
		String				bodyBetween = getOptionalExpandBetween();
		String				bodyBefore = getOptionalExpandBefore();
		String				bodyFirst = getOptionalExpandFirst();
		String				bodyEach = getRequiredExpandEach();
		String				bodyLast = getOptionalExpandLast();
		String				bodyAfter = getOptionalExpandAfter();
		String				bodyLone = getOptionalExpandLone();
		String				bodyEmpty = getOptionalExpandEmpty();

		MssYCFEngine genEngine = genContext.getGenEngine();

		IYCFGenKbGenItemObj genItem = genEngine.findContextItem(genContext, iteratorName );
		if( genItem == null ) {
			genEngine.getLog().message( "Could not find iterator \""
				+ iteratorName
				+ "\" attempting to expand \""
				+ "$" + getRequiredSourceText() + "$\"" );
			return( null );
		}

		if( ! ( genItem instanceof MssYCFGenIteratorObj ) ) {
			genEngine.getLog().message( "Context item \""
				+ iteratorName
				+ "\" must be a MssYCFGenIteratorObj, not a "
				+ genItem.getClass().getPackage().getName() + "." + genItem.getClass().getSimpleName()
				+ ".  \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		MssYCFGenIteratorObj	iterator = (MssYCFGenIteratorObj)genItem;

		String detailClassName;
		if (iterator.getDetailClass() != null) {
			detailClassName = iterator.getDetailClass().getRequiredName();
		}
		else {
			detailClassName = genEngine.getAnyClassName();
		}

		iteratorName = iterator.getRequiredName();

		if( ( iteratorName == null ) || ( 0 == iteratorName.length() ) ) {
			throw new RuntimeException( S_ProcName +  "Iterator is not properly named" );
		}

		if( ( detailClassName == null ) || ( 0 == detailClassName.length() ) ) {
			throw new RuntimeException( S_ProcName +  "Iterator must specify a detail class name" );
		}

		subContext = genEngine.getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
			genContext,
			detailClassName,
			null );
		subContext.setPrevContext( genContext );

		if( bodyBetween != null ) {
			failedBetween = "$" + bodyBetween + "$";
			itemBetween = genEngine.findContextItem( genContext, bodyBetween );
			if( itemBetween == null ) {
				genEngine.getLog().message( "Could not find expansion item for iterator \""
					+ iteratorName
					+ "\" "
					+ MssYCFGelCompiler._SPREAD_BETWEEN
					+ " \""
					+ bodyBetween
					+ "\"" );
			}
		}

		if( bodyBefore != null ) {
			failedBefore = "$" + bodyBefore + "$";
			itemBefore = genEngine.findContextItem( genContext, bodyBefore );
			if( itemBefore == null ) {
				genEngine.getLog().message( "Could not find expansion item for iterator \""
					+ iteratorName
					+ "\" "
					+ MssYCFGelCompiler._ITERATOR_BEFORE
					+ " \""
					+ bodyBefore
					+ "\"" );
			}
		}

		if( bodyAfter != null ) {
			failedAfter = "$" + bodyAfter + "$";
			itemAfter = genEngine.findContextItem( genContext, bodyAfter );
			if( itemAfter == null ) {
				genEngine.getLog().message( "Could not find expansion item for iterator \""
					+ iteratorName
					+ "\" "
					+ MssYCFGelCompiler._ITERATOR_AFTER
					+ " \""
					+ bodyAfter
					+ "\"" );
			}
		}

		if( bodyEmpty != null ) {
			failedEmpty = "$" + bodyEmpty + "$";
			if( ! bodyEmpty.equals( MssYCFGelCompiler._ITERATOR_EMPTY ) ) {
				itemEmpty = genEngine.findContextItem( genContext, bodyEmpty );
				if( itemEmpty == null ) {
					genEngine.getLog().message( "Could not find expansion item for iterator \""
						+ iteratorName
						+ "\" "
						+ MssYCFGelCompiler._ITERATOR_EMPTY
						+ " \""
						+ bodyEmpty
						+ "\"" );
				}
			}
		}

		if( bodyFirst != null ) {
			failedFirst = "$" + bodyFirst + "$";
		}

		if( bodyEach != null ) {
			failedEach = "$" + bodyEach + "$";
		}

		if( bodyLast != null ) {
			failedLast = "$" + bodyLast + "$";
		}

		if( bodyLone != null ) {
			failedLone = "$" + bodyLone + "$";
		}

		detailList = iterator.getDetailList( genContext );
		if( detailList == null ) {
			genEngine.getLog().message( "Could not get "
				+ iteratorName
				+ " detail object iteration.  \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		expansion = "";

		totalItems = detailList.size();

		if( totalItems <= 0 ) {
			if( bodyEmpty != null ) {
				if( itemEmpty != null ) {
					itemExpansion = genContext.expandItemBody( itemEmpty );
					if( itemExpansion != null ) {
						expansion = expansion + itemExpansion;
					}
					else {
						expansion = expansion + failedEmpty;
					}
				}
				else if( ! bodyEmpty.equals( MssYCFGelCompiler._ITERATOR_EMPTY ) ) {
					expansion = expansion + failedEmpty;
				}
			}
			else {
				genEngine.getLog().message( "Expansion of iterator \"" + iteratorName + "\" returned an empty set" );
			}
		}
		else {

			numItems = totalItems;
			while( numItems > 0 ) {

				if( bodyBefore != null ) {
					if( itemBefore != null ) {
						itemExpansion = genContext.expandItemBody( itemBefore );
						if( itemExpansion != null ) {
							expansion = expansion + itemExpansion;
						}
						else {
							expansion = expansion + failedBefore;
						}
					}
					else {
						expansion = expansion + failedBefore;
					}
				}

				if( numItems == 1 ) {

					detailDef = detailList.get(0);
					detailContext = genEngine.getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
						genContext,
						detailDef.getGenDefName(),
						detailDef );
					detailContext.setPrevContext( genContext );

					if( bodyLone != null ) {
						itemRule = genEngine.findContextItem( detailContext, bodyLone );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedLone;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_LONE
								+ " \""
								+ bodyLone
								+ "\"" );
							expansion = expansion + failedLone;
						}
					}
					else if( bodyFirst != null ) {
						itemRule = genEngine.findContextItem( detailContext, bodyFirst );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedFirst;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_FIRST
								+ " \""
								+ bodyFirst
								+ "\"" );
							expansion = expansion + failedFirst;
						}
					}
					else if( bodyLast != null ) {
						itemRule = genEngine.findContextItem( detailContext, bodyLast );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedLast;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_LAST
								+ " \""
								+ bodyLast
								+ "\"" );
							expansion = expansion + failedLast;
						}
					}
					else {
						itemRule = genEngine.findContextItem( detailContext, bodyEach );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedEach;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_EACH
								+ " \""
								+ bodyEach
								+ "\"" );
							expansion = expansion + failedEach;
						}
					}
				}
				else {

					detailDef = detailList.get(0);
					detailContext = genEngine.getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
						genContext,
						detailDef.getGenDefName(),
						detailDef );
					detailContext.setPrevContext( genContext );

					if( bodyFirst != null ) {
						itemRule = genEngine.findContextItem( detailContext, bodyFirst );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedFirst;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_FIRST
								+ " \""
								+ bodyFirst
								+ "\"" );
							expansion = expansion + failedFirst;
						}
					}
					else {
						itemRule = genEngine.findContextItem( detailContext, bodyEach );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedEach;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_EACH
								+ " \""
								+ bodyEach
								+ "\"" );
							expansion = expansion + failedEach;
						}
					}

					for( idx = 1; idx < numItems - 1; idx ++ ) {

						detailDef = detailList.get( idx );
						detailContext = genEngine.getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
							genContext,
							detailDef.getGenDefName(),
							detailDef );
						detailContext.setPrevContext( genContext );

						itemRule = genEngine.findContextItem( detailContext, bodyEach );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedEach;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_EACH
								+ " \""
								+ bodyEach
								+ "\"" );
							expansion = expansion + failedEach;
						}
					}

					detailDef = detailList.get( numItems - 1 );
					detailContext = genEngine.getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
						genContext,
						detailDef.getGenDefName(),
						detailDef );
					detailContext.setPrevContext( genContext );

					if( bodyLast != null ) {
						itemRule = genEngine.findContextItem( detailContext, bodyLast );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedLast;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_LAST
								+ " \""
								+ bodyLast
								+ "\"" );
							expansion = expansion + failedLast;
						}
					}
					else {
						itemRule = genEngine.findContextItem( detailContext, bodyEach );
						if( itemRule != null ) {
							itemExpansion = detailContext.expandItemBody( itemRule );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedEach;
							}
						}
						else {
							genEngine.getLog().message( "Could not find expansion item for iterator \""
								+ iteratorName
								+ "\" "
								+ MssYCFGelCompiler._ITERATOR_EACH
								+ " \""
								+ bodyEach
								+ "\"" );
							expansion = expansion + failedEach;
						}
					}
				}

				if( bodyAfter != null ) {
					if( itemAfter != null ) {
						itemExpansion = genContext.expandItemBody( itemAfter );
						if( itemExpansion != null ) {
							expansion = expansion + itemExpansion;
						}
						else {
							expansion = expansion + failedAfter;
						}
					}
					else {
						expansion = expansion + failedAfter;
					}
				}


				numItems --;

				if( numItems > 0 ) {
					if( bodyBetween != null ) {
						if( itemBetween != null ) {
							itemExpansion = genContext.expandItemBody( itemBetween );
							if( itemExpansion != null ) {
								expansion = expansion + itemExpansion;
							}
							else {
								expansion = expansion + failedBetween;
							}
						}
						else {
							expansion = expansion + failedBetween;
						}
					}
				}
			}
		}

		return( expansion );
	}
}

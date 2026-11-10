/*
 *  MSS Code Factory YCFCore 2.13 MssYCF
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow
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
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfcore.MssYCF;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.security.cert.*;
import java.text.*;
import java.util.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public class MssYCFGenIteratorObj
extends YCFGenKbGenIteratorObj
{
	protected IYCFGenKbDefClassObj detailClass = null;
	public IYCFGenKbDefClassObj getDetailClass() {
		return (detailClass);
	}

	public void setDetailClass( IYCFGenKbDefClassObj value ) {
		final String S_ProcName = "MssYCFGenIteratorObj.setDetailClass() ";
		if (value == null)
		{
			throw new RuntimeException(S_ProcName + "YCFGenIteratorObj.DetailClass.Set() argument is null");
		}
		detailClass = value;
	}

	protected IYCFGenKbDefClassObj requiredLookupDetailDef = null;
	public IYCFGenKbDefClassObj getRequiredLookupDetailDef() {
		return (requiredLookupDetailDef);
	}

	public void setRequiredLookupDetailDef( IYCFGenKbDefClassObj value ) {
		requiredLookupDetailDef = value;
	}

	public MssYCFGenIteratorObj() {
		super();
	}

	public MssYCFGenIteratorObj(MssYCFEngine schema) {
		super( schema );
	}

	public MssYCFGenIteratorObj(
		MssYCFEngine engine,
		String toolset,
		String scopeDefClassName,
		String genDefClassName,
		String itemName,
		String detailClassName )
	{
		super( engine );

		requiredLookupToolSet = schema.getToolSetTableObj().readToolSetByNameIdx(toolset);
		YCFGenKbGenItemBuff genItemRec = getGenItemBuff();

		genItemRec.setRequiredToolSetId( requiredLookupToolSet.getRequiredId() );

		if (scopeDefClassName != null && scopeDefClassName.length() > 0) {
			if (scopeDefClassName.equals("*")) {
				scopeDefClassName = "Object";
			}
			else {
				scopeDefClassName = engine.fixGenDefName( scopeDefClassName );
			}
			optionalLookupScopeDef = schema.getDefClassTableObj().readDefClassByNameIdx(scopeDefClassName);
			genItemRec.setOptionalScopeDefId( optionalLookupScopeDef.getRequiredId() );
		}
		else {
			optionalLookupScopeDef = null;
			genItemRec.setOptionalScopeDefId( null );
		}

		genDefClassName = engine.fixGenDefName( genDefClassName );
		requiredLookupGenDef = schema.getDefClassTableObj().readDefClassByNameIdx(genDefClassName);
		genItemRec.setRequiredGenDefId( requiredLookupGenDef.getRequiredId() );

		genItemRec.setRequiredName( itemName );

		requiredLookupDetailDef = schema.getDefClassTableObj().readDefClassByNameIdx( detailClassName );
	}

	/**
	 *	Get an enumeration of the members of the detail set/list
	 *
	 *	@return	Enumeration
	 */
	public ListIterator<IYCFLibAnyObj> enumerateDetails(MssYCFGenContext genContext) {
		final String S_ProcName = "MssYCFGenIteratorObj.enumerateDetails() ";
		throw new RuntimeException( S_ProcName + "Override not implemented yet");
	}

	/**
	 *	Iterators should NOT be expanded like other items.
	 *
	 *	@return	String
	 */
	public String expandBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "MssYCFGenIteratorObj.expandBody() ";
		throw new RuntimeException( S_ProcName + "MssYCFGenIterator instances can not be expanded directly" );
	}	

	/**
	 *	Expanding an iterator using Each syntax requires a rule to be applied for each element
	 *	of the iteration.
	 *
	 *	@param		genContext		The YCFGenContext of the iteration
	 *	@param		body				The String defining the body to expand for each element.
	 *
	 *	@return	String
	 */
	public String expandEach( MssYCFGenContext genContext, String body )
	{
		String subExpansion = null;
		MssYCFGenContext subContext = null;
		String subClassName = null;
		IYCFLibAnyObj elt = null;
		Iterator<IYCFLibAnyObj>	e;
		List<IYCFLibAnyObj> v = null;
		String ret = "";
		final String S_ProcName = "YCFGenIteratorObj.expandEach() ";

		if( genContext == null ) {
			throw new RuntimeException( S_ProcName + "genContext is null" );
		}

		if( ( body == null ) || ( 0 == body.length()) ) {
			throw new RuntimeException( S_ProcName + "body is null" );
		}

		//	getDetailList() is used to ensure that the element list is of the proper detail type

		v = getDetailList( genContext );
		if( v == null ) {
			throw new RuntimeException( S_ProcName + "getDetailList() returned a null vector" );
		}

		//	Get the attributes of the generation context for creating sub-contexts

		subClassName = getDetailClass().getRequiredName();

		IYCFGenKbGenItemObj genItem;
		e = v.iterator();
		while( e.hasNext() ) {
			elt = e.next();
			if( elt instanceof IYCFGenKbGenItemObj ) {
				genItem = (IYCFGenKbGenItemObj)elt;
				subContext = genContext.getGenEngine().getGenContextFactory().newGenContext( genContext.getGeneratingBuild(),
					genContext,
					subClassName,
					elt );
				subExpansion = subContext.expandItemBody( genItem );
				if( subExpansion != null ) {
					ret = ret + subExpansion;
				}
			}
			else {
				throw new RuntimeException( S_ProcName + "Expected element to be an IYCFGenKbGenItemObj, not a " + elt.getClass().getSimpleName() );
			}
		}

		//	Return the final expansion string

		return( ret );
	}	

	/**
	 *	Get a vector of the enumerated details so that the expansion engine knows how many details there are.
	 *	Ideally the elements of the enumerateDetails() enumeration would check to ensure that the elements
	 *	are instances of _DetailClass.  Unfortunately the <tt>instanceof</tt> operator only works with a
	 *	constant Class, not a dynamic Class instance.
	 *
	 *	@param		genContext		YCFGenContext
	 *
	 *	@return	Vector
	 */
	public List<IYCFLibAnyObj> getDetailList( MssYCFGenContext genContext ){
		IYCFLibAnyObj elt;
		List<IYCFLibAnyObj> ret = null;
		ListIterator<IYCFLibAnyObj> e;
		final String S_ProcName = "YCFGenIteratorObj.getDetailList() ";

		if( genContext == null ) {
			throw new RuntimeException( S_ProcName + "genContext is null" );
		}

		e = enumerateDetails( genContext );
		ret = new ArrayList<IYCFLibAnyObj>();

		while( e.hasNext() ) {
			elt = e.next();
			ret.add( elt );
		}

		return( ret );
	}
}

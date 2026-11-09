/*
 *  MSS Code Factory CFCore 2.13 MssCF
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

package org.msscf.msscf.v2_13.cfcore.MssCF;

import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;

public class MssCFGenContextFactory
{
	public MssCFGenContextFactory()
	{
	}

	public MssCFGenContext newGenContext(
		String				buildString,
		MssCFGenContext		genContext,
		String				subClassGenDefName,
		ICFLibAnyObj		subObject )
	{
		return( new MssCFGenContext( buildString, genContext, subClassGenDefName, subObject ) );
	}

	public MssCFGenContext newGenContext(
		String				buildString,
		MssCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName )
	{
		return( new MssCFGenContext( buildString,
			engine,
			argRootGenDir,
			toolset,
			scopeDefClassName,
			genDefClassName,
			itemName ) );
	}

	public MssCFGenContext newGenContext(
		String				buildString,
		MssCFEngine			engine,
		String				argRootGenDir,
		String				toolset,
		String				scopeDefClassName,
		String				genDefClassName,
		String				itemName,
		ICFLibAnyObj		argGenDef,
		ICFLibAnyObj		argScopeDef )
	{
		return( new MssCFGenContext( buildString,
			engine,
			argRootGenDir,
			toolset,
			scopeDefClassName,
			genDefClassName,
			itemName,
			argGenDef,
			argScopeDef ) );
	}
}

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

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.security.cert.*;
import java.text.*;
import java.util.*;

import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKbObj.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKbObj.*;

public class MssCFGenRuleObj
extends CFGenKbGenRuleObj
{
	public MssCFGenRuleObj() {
		super();
	}

	public MssCFGenRuleObj(MssCFEngine schema) {
		super( schema );
	}

	public String getBody( MssCFGenContext genContext ) {
		final String S_ProcName = "MssCFGenRuleObj.getBody() ";
		ICFGenKbGelInstructionObj bodyBin = CFGenKbGenRuleObj.getBodyBin( genContext.getGenEngine().getGelCompiler(), this);
		if( bodyBin == null ) {
			throw new RuntimeException( S_ProcName + "Could not resolve compiled Body GEL executable" );
		}
		String body = bodyBin.expand( genContext );
		return( body );
	}

	public String expandBody(MssCFGenContext genContext) {
		final String S_ProcName = "MssCFGenRuleObj.expandBody() ";

		String ret = null;

		if (genContext == null) {
			throw new RuntimeException( S_ProcName + "genContext is null");
		}

		if (getRequiredBody() == null) {
			throw new RuntimeException(S_ProcName
				+ "Rule " + getRequiredName()
				+ ", ScopeDef=" + ((getOptionalLookupScopeDef() == null) ? "null" : getOptionalLookupScopeDef().getRequiredName())
				+ ", GenDef=" + getRequiredLookupGenDef().getRequiredName()
				+ " has a null RequiredBody");
		}

		ret = getBody( genContext );

		return (ret);
	}
}

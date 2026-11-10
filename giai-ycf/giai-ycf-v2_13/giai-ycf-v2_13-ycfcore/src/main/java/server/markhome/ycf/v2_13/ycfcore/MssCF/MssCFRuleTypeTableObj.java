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
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

public class MssYCFRuleTypeTableObj
extends YCFGenKbRuleTypeTableObj
{
	public MssYCFRuleTypeTableObj()
	{
		super();
	}

	public MssYCFRuleTypeTableObj(MssYCFEngine schema)
	{
		super( schema );
	}

	public IYCFGenKbRuleTypeObj newInstance()
	{
		MssYCFRuleTypeObj obj = new MssYCFRuleTypeObj( (MssYCFEngine)schema);
		return (obj);
	}
}

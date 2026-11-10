// Description: Java 11 implementation of a YCFGenKb schema pool.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFGenKbSchemaPool
{

	protected volatile static YCFGenKbSchemaPool schemaPool = null;
	protected String jndiName = null;
	protected YCFGenKbConfigurationFile configFile = null;
	protected LinkedList<IYCFGenKbSchema> instances = new LinkedList<IYCFGenKbSchema>();
	public YCFGenKbSchemaPool() {
	}

	public static YCFGenKbSchemaPool getSchemaPool() {
		return( schemaPool );
	}

	public static void setSchemaPool( YCFGenKbSchemaPool pool ) {
		if( schemaPool == null ) {
			schemaPool = pool;
		}

	}

	public YCFGenKbConfigurationFile getConfigurationFile() {
		return( configFile );
	}

	public void setConfigurationFile( YCFGenKbConfigurationFile value ) {
		
		configFile = value;
	}


	/**
	 *	Retrieve an entry from the pool with a previously
	 *	established database connection.
	 */
	public synchronized IYCFGenKbSchema getInstance() {
		IYCFGenKbSchema retInst = null;
		if( instances != null ) {
			if( instances.isEmpty() ) {
				retInst = newInstance();
				retInst.setConfigurationFile( (YCFGenKbConfigurationFile)getConfigurationFile() );
				retInst.setJndiName( getJndiName() );
				retInst.connect();
			}
			else {
				retInst = instances.removeFirst();
			}
		}
		else {
			retInst = null;
		}
		return( retInst );
	}

	/**
	 *	Return an entry to the pool.
	 */
	public synchronized void releaseInstance( IYCFGenKbSchema inst ) {
		if( inst == null ) {
			return;
		}
		inst.rollback();
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	/**
	 *	You need to overload the implementation of newInstance() to return
	 *	connected instances of your backing store.
	 */
	public IYCFGenKbSchema newInstance() {
		IYCFGenKbSchema retInst = new YCFGenKbSchema();
		return( retInst );
	}

	/**
	 *	Overload disposeInstance().
	 */
	public void disposeInstance( IYCFGenKbSchema inst ) {
		try {
			inst.disconnect( false );
		}
		catch( RuntimeException e ) {
		}
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		jndiName = value;
		if( ( jndiName != null ) && ( jndiName.length() > 0 ) ) {
			configFile = null;
		}
	}

}

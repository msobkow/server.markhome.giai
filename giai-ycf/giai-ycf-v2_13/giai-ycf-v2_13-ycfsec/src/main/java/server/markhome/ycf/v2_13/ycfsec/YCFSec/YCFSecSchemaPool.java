// Description: Java 11 implementation of a YCFSec schema pool.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public class YCFSecSchemaPool
{

	protected volatile static YCFSecSchemaPool schemaPool = null;
	protected String jndiName = null;
	protected YCFSecConfigurationFile configFile = null;
	protected LinkedList<IYCFSecSchema> instances = new LinkedList<IYCFSecSchema>();
	public YCFSecSchemaPool() {
	}

	public static YCFSecSchemaPool getSchemaPool() {
		return( schemaPool );
	}

	public static void setSchemaPool( YCFSecSchemaPool pool ) {
		if( schemaPool == null ) {
			schemaPool = pool;
		}

	}

	public YCFSecConfigurationFile getConfigurationFile() {
		return( configFile );
	}

	public void setConfigurationFile( YCFSecConfigurationFile value ) {
		
		configFile = value;
	}


	/**
	 *	Retrieve an entry from the pool with a previously
	 *	established database connection.
	 */
	public synchronized IYCFSecSchema getInstance() {
		IYCFSecSchema retInst = null;
		if( instances != null ) {
			if( instances.isEmpty() ) {
				retInst = newInstance();
				retInst.setConfigurationFile( (YCFSecConfigurationFile)getConfigurationFile() );
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
	public synchronized void releaseInstance( IYCFSecSchema inst ) {
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
	public IYCFSecSchema newInstance() {
		IYCFSecSchema retInst = new YCFSecSchema();
		return( retInst );
	}

	/**
	 *	Overload disposeInstance().
	 */
	public void disposeInstance( IYCFSecSchema inst ) {
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

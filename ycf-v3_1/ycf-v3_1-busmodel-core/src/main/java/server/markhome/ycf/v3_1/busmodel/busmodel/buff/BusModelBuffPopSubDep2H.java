// Description: Java 25 implementation of a PopSubDep2 history buffer object

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.busmodel.busmodel.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

public class BusModelBuffPopSubDep2H extends BusModelBuffPopDepH
    implements IBusModelPopSubDep2H
{
	protected ICFKeyHash256 requiredPopSubDep1Id;
	protected String requiredName;

    public BusModelBuffPopSubDep2H() {
            super();
		requiredPopSubDep1Id = CFDbKeyHash256.fromHex( IBusModelPubPopSubDep2.POPSUBDEP1ID_INIT_VALUE.toString() );
		requiredName = IBusModelPubPopSubDep2.NAME_INIT_VALUE;
    }

    @Override
    public int getClassCode() {
            return( IBusModelPopSubDep2.CLASS_CODE );
    }

	@Override
	public ICFKeyHash256 getRequiredPopSubDep1Id() {
		return(requiredPopSubDep1Id);
	}

	public void setRequiredPopSubDep1Id( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredPopSubDep1Id",
				1,
				"value" );
		}
		requiredPopSubDep1Id = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

    @Override
    public boolean equals( Object obj ) {
        if (obj == null) {
            return( false );
        }
        else if (obj instanceof IBusModelPopSubDep2) {
            IBusModelPopSubDep2 rhs = (IBusModelPopSubDep2)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredPopSubDep1Id() != null ) {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					if( ! getRequiredPopSubDep1Id().equals( rhs.getRequiredPopSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelPopSubDep2H) {
			if (!super.equals(obj)) {
				return( false );
			}
            IBusModelPopSubDep2H rhs = (IBusModelPopSubDep2H)obj;
        if (!super.equals(obj)) {
            return( false );
        }
			if( getRequiredPopSubDep1Id() != null ) {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					if( ! getRequiredPopSubDep1Id().equals( rhs.getRequiredPopSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelScopeHPKey) {
			return( super.equals(obj) );
        }
        else if (obj instanceof IBusModelPopSubDep2ByPopSubDep1IdxKey) {
            IBusModelPopSubDep2ByPopSubDep1IdxKey rhs = (IBusModelPopSubDep2ByPopSubDep1IdxKey)obj;
			if( getRequiredPopSubDep1Id() != null ) {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					if( ! getRequiredPopSubDep1Id().equals( rhs.getRequiredPopSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else if (obj instanceof IBusModelPopSubDep2ByUNameIdxKey) {
            IBusModelPopSubDep2ByUNameIdxKey rhs = (IBusModelPopSubDep2ByUNameIdxKey)obj;
			if( getRequiredPopSubDep1Id() != null ) {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					if( ! getRequiredPopSubDep1Id().equals( rhs.getRequiredPopSubDep1Id() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredPopSubDep1Id() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
            return( true );
        }
        else {
			return( super.equals(obj) );
        }
    }
    
    @Override
    public int hashCode() {
        int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredPopSubDep1Id().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
        return( hashCode & 0x7fffffff );
    }

    @Override
    public int compareTo( Object obj ) {
        int cmp;
        if (obj == null) {
            return( 1 );
        }
        else if (obj instanceof IBusModelPopSubDep2) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelPopSubDep2 rhs = (IBusModelPopSubDep2)obj;
			if (getRequiredPopSubDep1Id() != null) {
				if (rhs.getRequiredPopSubDep1Id() != null) {
					cmp = getRequiredPopSubDep1Id().compareTo( rhs.getRequiredPopSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPopSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelScopeHPKey) {
        return( super.compareTo(obj) );
        }
        else if (obj instanceof IBusModelPopSubDep2H) {
        cmp = super.compareTo(obj);
        if (cmp != 0) {
            return( cmp );
        }
        IBusModelPopSubDep2H rhs = (IBusModelPopSubDep2H)obj;
			if (getRequiredPopSubDep1Id() != null) {
				if (rhs.getRequiredPopSubDep1Id() != null) {
					cmp = getRequiredPopSubDep1Id().compareTo( rhs.getRequiredPopSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPopSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelPopSubDep2ByPopSubDep1IdxKey ) {
            IBusModelPopSubDep2ByPopSubDep1IdxKey rhs = (IBusModelPopSubDep2ByPopSubDep1IdxKey)obj;
			if (getRequiredPopSubDep1Id() != null) {
				if (rhs.getRequiredPopSubDep1Id() != null) {
					cmp = getRequiredPopSubDep1Id().compareTo( rhs.getRequiredPopSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPopSubDep1Id() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else if (obj instanceof IBusModelPopSubDep2ByUNameIdxKey ) {
            IBusModelPopSubDep2ByUNameIdxKey rhs = (IBusModelPopSubDep2ByUNameIdxKey)obj;
			if (getRequiredPopSubDep1Id() != null) {
				if (rhs.getRequiredPopSubDep1Id() != null) {
					cmp = getRequiredPopSubDep1Id().compareTo( rhs.getRequiredPopSubDep1Id() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredPopSubDep1Id() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
            return( 0 );
        }
        else {
        return( super.compareTo(obj) );
        }
    }
	@Override
    public void set( IBusModelScope src ) {
		if( src instanceof BusModelBuffPopSubDep2 ) {
			setPopSubDep2( (BusModelBuffPopSubDep2)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelBuffPopSubDep2" );
		}
    }

	@Override
    public void setPopSubDep2( IBusModelPopSubDep2 src ) {
        super.setPopDep( src );
		setRequiredPopSubDep1Id( src.getRequiredPopSubDep1Id() );
		setRequiredName( src.getRequiredName() );
    }

	@Override
    public void set( IBusModelScopeH src ) {
		if( src instanceof IBusModelPopSubDep2H ) {
			setPopSubDep2( (IBusModelPopSubDep2H)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPopSubDep2H" );
		}
    }

	@Override
    public void setPopSubDep2( IBusModelPopSubDep2H src ) {
        super.setPopDep( src );
		setRequiredPopSubDep1Id( src.getRequiredPopSubDep1Id() );
		setRequiredName( src.getRequiredName() );
    }

    public String getXmlAttrFragment() {
        String ret = super.getXmlAttrFragment() 
			+ " RequiredPopSubDep1Id=" + "\"" + getRequiredPopSubDep1Id().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"";
        return( ret );
    }

    public String toString() {
        String ret = "<BusModelBuffPopSubDep2H" + getXmlAttrFragment() + "/>";
        return( ret );
    }
}

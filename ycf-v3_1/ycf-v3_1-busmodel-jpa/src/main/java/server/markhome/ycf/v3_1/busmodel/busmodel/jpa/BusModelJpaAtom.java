// Description: Java 25 JPA implementation of a Atom entity definition object.

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

package server.markhome.ycf.v3_1.busmodel.busmodel.jpa;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

@Entity
@Table(
	name = "atomdef", schema = "BusModel31",
	indexes = {
		@Index(name = "AtomIdIdx", columnList = "Id", unique = true)
	}
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("43022")
@Transactional(Transactional.TxType.REQUIRED)
@PersistenceContext(unitName = "BusModelPU")
public class BusModelJpaAtom extends BusModelJpaValue
	implements IBusModelAtom
{

	@Column( name="DbName", nullable=true, length=32 )
	protected String optionalDbName;

	public BusModelJpaAtom() {
		super();
		optionalDbName = null;
	}

	@Override
	public int getClassCode() {
		return( IBusModelAtom.CLASS_CODE );
	}

	@Override
	public String getOptionalDbName() {
		return(optionalDbName);
	}

	public void setOptionalDbName( String value ) {
		if( value != null && value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDbName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		optionalDbName = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if (obj == null) {
			return( false );
		}
		else if (obj instanceof IBusModelAtom) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelAtom rhs = (IBusModelAtom)obj;
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelAtomH) {
			if (!super.equals(obj)) {
				return( false );
			}
			IBusModelAtomH rhs = (IBusModelAtomH)obj;
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					if( ! getOptionalDbName().equals( rhs.getOptionalDbName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if (obj instanceof IBusModelValueHPKey) {
			return( super.equals(obj) );
		}
		else {
			return( super.equals(obj) );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		if( getOptionalDbName() != null ) {
			hashCode = hashCode + getOptionalDbName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if (obj == null) {
			return( 1 );
		}
		else if (obj instanceof IBusModelAtom) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelAtom rhs = (IBusModelAtom)obj;
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelAtomH ) {
			cmp = super.compareTo(obj);
			if (cmp != 0) {
				return( cmp );
			}
			IBusModelAtomH rhs = (IBusModelAtomH)obj;
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			cmp = super.compareTo(obj);
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelValue src ) {
		if( src instanceof IBusModelAtom ) {
			setAtom( (IBusModelAtom)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelJpaAtom" );
		}
	}

	@Override
	public void setAtom( IBusModelAtom src ) {
		super.setValue( src );
		setOptionalDbName(src.getOptionalDbName());
	}

	@Override
	public void set( IBusModelValueH src ) {
		if( src instanceof IBusModelAtomH ) {
			setAtom( (IBusModelAtomH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelAtomH" );
		}
	}

	@Override
	public void setAtom( IBusModelAtomH src ) {
		super.setValue( src );
		setOptionalDbName(src.getOptionalDbName());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment() 
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " OptionalDbName=" + ( ( getOptionalDbName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDbName() ) + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelJpaAtom" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}

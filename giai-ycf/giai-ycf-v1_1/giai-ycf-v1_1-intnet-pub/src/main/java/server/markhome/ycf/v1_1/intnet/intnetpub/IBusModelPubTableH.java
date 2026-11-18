// Description: Java 25 public interface for a Table history object

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
//import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;

/**
 *	IBusModelPubTableH provides access to public history records matching the BusModelPubTable object change history.
 */
public interface IBusModelPubTableH extends IBusModelPubScopeH
{
	public CFDbKeyHash256 getRequiredSchemaDefId();
	public void setRequiredSchemaDefId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( CFDbKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public String getOptionalDbName();
	public void setOptionalDbName( String value );
	public String getOptionalShortName();
	public void setOptionalShortName( String value );
	public String getOptionalLabel();
	public void setOptionalLabel( String value );
	public String getOptionalShortDescription();
	public void setOptionalShortDescription( String value );
	public String getOptionalDescription();
	public void setOptionalDescription( String value );
	public boolean getRequiredPageData();
	public void setRequiredPageData( boolean value );
	public CFDbKeyHash256 getOptionalPrimaryIndexId();
	public void setOptionalPrimaryIndexId( CFDbKeyHash256 value );
	public String getRequiredTableClassCode();
	public void setRequiredTableClassCode( String value );
	public CFDbKeyHash256 getOptionalLookupIndexId();
	public void setOptionalLookupIndexId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalAltIndexId();
	public void setOptionalAltIndexId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalQualifyingTableId();
	public void setOptionalQualifyingTableId( CFDbKeyHash256 value );
	public boolean getRequiredIsInstantiable();
	public void setRequiredIsInstantiable( boolean value );
	public boolean getRequiredHasHistory();
	public void setRequiredHasHistory( boolean value );
	public boolean getRequiredHasAuditColumns();
	public void setRequiredHasAuditColumns( boolean value );
	public boolean getRequiredIsMutable();
	public void setRequiredIsMutable( boolean value );
	public boolean getRequiredIsServerOnly();
	public void setRequiredIsServerOnly( boolean value );
	public IBusModelPubSchema.LoaderBehaviourEnum getRequiredLoaderBehaviour();
	public void setRequiredLoaderBehaviour( IBusModelPubSchema.LoaderBehaviourEnum value );
	public IBusModelPubSchema.SecScopeEnum getRequiredSecScope();
	public void setRequiredSecScope( IBusModelPubSchema.SecScopeEnum value );
	public IBusModelPubSchema.CodeVisibilityEnum getRequiredCodeVis();
	public void setRequiredCodeVis( IBusModelPubSchema.CodeVisibilityEnum value );
	@Override
	public boolean equals( Object obj );

	@Override
	public int hashCode();

	//@Override
	public int compareTo( Object obj );

	public void setTable( IBusModelPubTable src );
	public void setTable( IBusModelPubTableH src );}

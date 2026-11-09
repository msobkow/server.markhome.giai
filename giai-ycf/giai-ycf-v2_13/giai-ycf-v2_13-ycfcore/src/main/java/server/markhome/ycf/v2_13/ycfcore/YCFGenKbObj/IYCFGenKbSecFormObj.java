// Description: Java 11 Object interface for CFGenKb SecForm.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbSecFormObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFGenKbSecUserObj instance who created this instance.
	 */
	ICFGenKbSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFGenKbSecUserObj instance who updated this instance.
	 */
	ICFGenKbSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a SecForm.
	 *
	 *	@return	CFGenKbSecFormObj instance which should be subsequently referenced.
	 */
	ICFGenKbSecFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecFormObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecFormObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecForm instance.
	 *
	 *	@return	The newly locked ICFGenKbSecFormEditObj edition of this instance.
	 */
	ICFGenKbSecFormEditObj beginEdit();

	/**
	 *	End this edition of this SecForm instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecForm instance.
	 *
	 *	@return	The ICFGenKbSecFormEditObj edition of this instance.
	 */
	ICFGenKbSecFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecForm instance as a ICFGenKbSecFormEditObj.
	 *
	 *	@return	The ICFGenKbSecFormEditObj edition of this instance.
	 */
	ICFGenKbSecFormEditObj getEditAsSecForm();

	/**
	 *	Get the ICFGenKbSecFormTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbSecFormTableObj table cache which manages this instance.
	 */
	ICFGenKbSecFormTableObj getSecFormTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbSecFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecFormBuff instance which currently backs this object.
	 */
	CFGenKbSecFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbSecFormBuff value );

	/**
	 *	Get the CFGenKbSecFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecFormBuff instance which currently backs this object.
	 */
	CFGenKbSecFormBuff getSecFormBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbSecFormPKey primary key for this instance.
	 */
	CFGenKbSecFormPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbSecFormPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbSecFormPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required int attribute SecFormId.
	 *
	 *	@return	The required int attribute SecFormId.
	 */
	int getRequiredSecFormId();

	/**
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required String attribute JEEServletMapName.
	 *
	 *	@return	The required String attribute JEEServletMapName.
	 */
	String getRequiredJEEServletMapName();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the required ICFGenKbSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The required ICFGenKbSecAppObj instance referenced by the Application key.
	 */
	ICFGenKbSecAppObj getRequiredContainerApplication();

	/**
	 *	Get the required ICFGenKbSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The required ICFGenKbSecAppObj instance referenced by the Application key.
	 */
	ICFGenKbSecAppObj getRequiredContainerApplication( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}

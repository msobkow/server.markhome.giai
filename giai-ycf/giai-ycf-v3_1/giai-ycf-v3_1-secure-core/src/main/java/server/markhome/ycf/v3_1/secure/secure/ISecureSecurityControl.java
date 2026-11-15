// Description: Java 25 Private Security Control Interface.

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

package server.markhome.ycf.v3_1.secure.secure;

import java.util.List;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFDbKeyHash256;
import server.markhome.ycf.v3_1.secure.securepub.ISecurePubSecurityService;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtSecurityService;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtSecurityControl;

/*
 *	An ISecureSecurityControl is the private security service control interface
 *	used by the system to tell registered caches what information to forget about, including
 *	users, permission groups, tenants, clusters, or the entire cache of information. Application logic
 *	should never invoke the control interface for any reason.  It is intended solely for use by the
 *	infrastructure to issue commands to security cache implementations that have registered for change
 *	and control propagation.
 */
public interface ISecureSecurityControl extends ISecureProtSecurityControl, ISecureSecurityService {
}

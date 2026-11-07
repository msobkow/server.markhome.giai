// Description: Java 25 Private Security Service Interface.

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

import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFDbKeyHash256;
import server.markhome.ycf.v3_1.secure.securepub.ISecurePubSecurityService;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtSecurityService;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtSecurityControl;

/*
 *	An ISecureSecurityService is the private service interface used in
 *	application server code to implement a SecurityService cache that can accept new
 *	server registrations.
 *	The ISecureSecurityControl interface is a private interface used by the
 *	security server to control security server caches that have registered interest
 *	in the security server. The control interface is used to communicate between the
 *	root security server and the security server caches.
 */
public interface ISecureSecurityService extends ISecureProtSecurityService {

	/**
	 *	Register a SecurityControl implementation as an interested listener to receive propagation of the forget commands filtered by their
	 *	intersection with information in this cache.
	 *
	 *	@param securityControl If you can't control it, you can't register it.
	 *
	 *	@return true if a new interest registration was established, false if the interest had been previously established.
	 */
	public default boolean registerInterest(ISecureSecurityControl securityControl) {
		return registerInterest((ISecureProtSecurityControl)securityControl);
	};

	/**
	 *	Remove a SecurityControl implementation from the registered list of listeners.
	 *
	 *	@param securityControl If you can't control it, you can't register it.
	 *
	 *	@return true if the security control was removed, false if it was not found.
	 */
	public default boolean forgetInterest(ISecureSecurityControl securityControl) {
		return forgetInterest((ISecureProtSecurityControl)securityControl);
	};

	/**
	 *	Did the specified SecurityControl register interest in filtered forget commands?
	 *
	 *	@param securityControl If you can't control it, you can't register it.
	 *
	 *	@return true if the SecurityControl is in the interest registration list, otherwise false.
	 */
	public default boolean isInterested(ISecureSecurityControl securityControl) {
		return isInterested((ISecureProtSecurityControl)securityControl);
	};
}

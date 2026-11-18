// Description: Java 25 Secure Public Role Information Implementation

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

package server.markhome.ycf.v3_1.secure.securepub;

import java.util.Comparator;

/*
 *	The SecurePubRoleInfoDependencyComparator objects are passed in to the SecurePub schema implementation to be bound
 *	to the security system.  Their natural order is to compare by dependency first, and by name second.
 */
public class SecurePubRoleInfoDependencyComparator implements Comparator<SecurePubRoleInfo>
{
	@Override
	public int compare( SecurePubRoleInfo lhs, SecurePubRoleInfo rhs ) {
		if( lhs == null ) {
			if ( rhs == null ) {
				return( 0 );
			}
			else {
				return( -1 );
			}
		}
		else if( rhs == null ) {
			return( 1 );
		}
		else {
			String lhsName = lhs.getRoleName();
			String rhsName = rhs.getRoleName();

			String lhsEnables = lhs.getEnables();
			String rhsEnables = rhs.getEnables();
			String lhsEnablesArr[] = lhsEnables.split(" ");
			String rhsEnablesArr[] = rhsEnables.split(" ");
			boolean rhsEnablesLhs = false;
			boolean lhsEnablesRhs = false;
			for (String v: lhsEnablesArr) {
				if (rhsName.equals(v)) {
					lhsEnablesRhs = true;
					break;
				}
			}
			for (String v: rhsEnablesArr) {
				if (lhsName.equals(v)) {
					rhsEnablesLhs = true;
					break;
				}
			}

			String lhsIncludes = lhs.getIncludes();
			String rhsIncludes = rhs.getIncludes();
			String lhsIncludesArr[] = lhsIncludes.split(" ");
			String rhsIncludesArr[] = rhsIncludes.split(" ");
			boolean rhsIncludesLhs = false;
			boolean lhsIncludesRhs = false;
			for (String v: lhsIncludesArr) {
				if (rhsName.equals(v)) {
					lhsIncludesRhs = true;
					break;
				}
			}
			for (String v: rhsIncludesArr) {
				if (lhsName.equals(v)) {
					rhsIncludesLhs = true;
					break;
				}
			}

			int ret;

			if (lhsEnablesRhs) {
				if (rhsEnablesLhs) {
					if (lhsIncludesRhs) {
						if (rhsIncludesLhs) {
							ret = lhsName.compareTo(rhsName);
						}
						else {
							ret = 1;
						}
					}
					else {
						if (rhsIncludesLhs) {
							ret = -1;
						}
						else {
							ret = lhsName.compareTo(rhsName);
						}
					}
				}
				else {
					ret = 1;
				}
			}
			else {
				if (rhsEnablesLhs) {
					ret = -1;
				}
				else {
					if (lhsIncludesRhs) {
						if (rhsIncludesLhs) {
							ret = lhsName.compareTo(rhsName);
						}
						else {
							ret = 1;
						}
					}
					else {
						if (rhsIncludesLhs) {
							ret = -1;
						}
						else {
							ret = lhsName.compareTo(rhsName);
						}
					}
				}
			}
			return( ret );
		}
	}
}

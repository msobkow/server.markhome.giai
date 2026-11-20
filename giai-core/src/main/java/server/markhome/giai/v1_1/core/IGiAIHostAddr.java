/*
 *	server.markhome.giai - Guided Intelligence Architecture Implementation v1.1 Core Services
 *	
 *	Copyright (c) 2016-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *	
 *	The core foundation library CFLib is Licensed under the GNU Library General Public License, Version 3.0 or later; all other modules are Licensed under
 *	the GNU General Public License, Version 3.0 or later, or under a Commercial License purchased from Mark Stephen Sobkow by contacting him at mark.sobkow@gmail.com
 *	and negotiating terms to cover your legal requirements for your product and tool development plans, arrange payment using Canadian legal currency transfer
 *	facilities, and receive your customized Commercial License granting permission to extend and enhance the GNU GPL 3.0 or later licensed code base.
 *	
 *	In the event that you purchase a Commercial Development License, your License will be terminated if your organization distributes the application source
 *	code externally, allows external users to access the resulting applications, or the organization is rebranded, merged, or restructured, or if you violate
 *	International or Canadian Legal Restrictions on Software Development and Deployment.
 *	
 *	In the event that you purchase a Commercial Distribution License, your License will be terminated if your oganization is rebranded, merged, or restructured.
 *	
 *	In the event that you purchase a Transferrable Commercial License, your License is only terminated if your organization develops or produces illegal software
 *	tools and technologies according to International Treaty Law, or Laws of the Country of Canada, in accordance with the legal restrictions on Canadian Application
 *	Source Code Development, Deployment, and Distribution.
 *	
 *	Any one of these Licenses comprises your organization's "License". You may not use these files nor derive variations of them except in compliance with the
 *	License or Commercial License applicable to the source code files in question.
 *	
 *	Samples of the Commercial License permission grants are available at the following URL.  You should also have received samples of the commercial licenses with
 *	this module of application code or configuration and driver data.
 *	
 *		https://msobkow.github.io/mark-stephen-sobkows-licenses/
 *		file:sample-giai-v1_1-ethical-development-license.txt
 *		file:sample-giai-v1_1-ethical-deployment-license.txt
 *		file:sample-giai-v1_1-ethical-distribution-license.txt
 *		file:sample-giai-v1_1-transferrable-ethical-license.txt
 *	
 *	but do not actually grant any permissions to your organization as they have not yet been negotiated for, paid for, or delivered to your organization; they are
 *	only examples of what permissions the Commercial Licenses grant.
 *	
 *	You may obtain a copy of the Open Source Licenses supported at:
 *	
 *	    http://gnu.org/
 *	
 *	Unless required by applicable law or agreed to in writing, software distributed under the Licenses is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *	either express or implied, unless required by International Law and Treaty Agreements with Canada as a Signatory as interpreted by the International Criminal Court, the Canadian
 *	Constition, the Canadian Charter of Rights, or Canadian Federal Law as interpreted by our Supreme Court of Canada.  See the Licenses for the specific language governing permissions
 *	and limitations under the Licenses.
 *	
 *	If you wish to modify and use this code without publishing your changes, or integrate it with proprietary code, please contact Mark Stephen
 *	Sobkow for a commercial license at mark.sobkow@gmail.com.
 *	
 *	SPDX-License-Identifier: LGPL-3.0-or-later
 *	SPDX-License-Identifier: GPL-3.0-or-later
 */

package server.markhome.giai.v1_1.core;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The IGiAIHostAddr is a packed address for either IPV4 or IPV6 addresses, with indicators and detectors for which is which.
 *
 * @since 2026
 * @author msobkow
 */
public final interface IGiAIHostAddr extends IGiAIAnyObj {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	@JSProperty
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance(null);

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIHostAddr getService() {
		IGiAIHostAddr ref = ((IGiAIHostAddr)(singleton.get()));
		if (ref == null) {
			ref = new GiAIHostAddr();
			singleton.set(null, ref);
			ref = ((IGiAIHostAddr)(singleton.get()));
		}
		return(ref);
	}

    public static final int IPV6_LENGTH = 16;
    public static final int IPV4_LENGTH = 4;
    public static final int IPV4_PAD = IPV6_LENGTH - IPV4_LENGTH;

    private static boolean addrHeaderInitialized = false;
    private static byte[] addrHeader = new byte[IPV6_LENGTH];
//    static {
//        for (int i = 0; i < IPV4_LENGTH; i++) {
//            addrHeader[i] = 0;
//        }
//        for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
//            addrHeader[i] = -1;
//        }
//    }

    /**
     * Is the address header initialized?
     * 
     * @return
     */
    public static boolean isAddrHeaderInitialized() {
        if (addrHeaderInitialized) {
            return true;
        }
    
        // Check if addrHeader is already initialized
        for (int i = 0; i < IPV4_LENGTH; i++) {
            if (addrHeader[i] != 0) {
                addrHeaderInitialized = true;
                break;
            }
        }

        if (!addrHeaderInitialized) {
            for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
                if (addrHeader[i] != -1 && addrHeader[i] != 0) {
                    addrHeaderInitialized = true;
                    break;
                }
            }
			if (!addrHeaderInitialized) {
            	for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
               		addrHeader[i] = -1;
				}
			}
        }

        return addrHeaderInitialized;
    }

    /**
     * Is the address header initialized with an IPV4 part but no IPV6 part?
     * 
     * @return
     */
    public static boolean hasIPv4AddrHeader() {
        if (!isAddrHeaderInitialized()) {
            return false;
        }
        boolean hasIPv4Part = false;
        for (int i = 0; i < IPV4_LENGTH; i++) {
            if (addrHeader[i] != 0) {
                hasIPv4Part = true;
                break;
            }
        }
        for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
            if (addrHeader[i] != -1) {
                return false;
            }
        }
        return hasIPv4Part;
    }

    /**
     * Is the address header initialized with an IPV6 part but no IPV4 part?
     * 
     * @return
     */
    public static boolean hasIPv6AddrHeader() {
        if (!isAddrHeaderInitialized()) {
            return false;
        }
        boolean hasIPv4Part = false;
        for (int i = 0; i < IPV4_LENGTH; i++) {
            if (addrHeader[i] != 0) {
                hasIPv4Part = true;
                break;
            }
        }
        for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
            if (addrHeader[i] != -1) {
                return hasIPv4Part;
            }
        }
        return false;
    }
    
    /**
     * Initialize the address header with the server's IP address.
     * If the server's IP address is not available, it will use the loopback address.
     * Does not force reinitialization.
     */
    public static void initAddrHeader() {
        initAddrHeader(false);
    }

    /**
     * Initialize the address header with the server's IP address.
     * If the server's IP address is not available, it will use the loopback address.
     * Allows you to force reinitialization even if already initialized; required after
	 * network connections are reset and rebound, such as in a restart of a service,
	 * or a migration to another server in the cluster.
     *
     * @param reinit
     */
    public static void initAddrHeader(boolean reinit) {
        if (isAddrHeaderInitialized() && !reinit) {
            return;
        }

        // Try to initialize addrHeader with the server's IP address
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            byte[] address = inetAddress.getAddress();

            if (address.length == IPV6_LENGTH) {
                System.arraycopy(address, 0, addrHeader, 0, IPV6_LENGTH);
                addrHeaderInitialized = true;
            } else if (address.length == IPV4_LENGTH) {
                System.arraycopy(address, 0, addrHeader, 0, IPV4_LENGTH);
                for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
                    addrHeader[i] = -1;
                }
                addrHeaderInitialized = true;
            }
        } catch (UnknownHostException e) {
            // Fallback to IPv4 127.0.0.1 (loopback) in worst case
            addrHeader[0] = 127;
            addrHeader[1] = 0;
            addrHeader[2] = 0;
            addrHeader[3] = 1;
            for (int i = IPV4_LENGTH; i < IPV6_LENGTH; i++) {
                addrHeader[i] = -1;
            }
            addrHeaderInitialized = true;
        }
    }

    /**
     * Get the address header.
     * 
     * @param reinit
     * @return
     */
    protected static byte[] getAddrHeader(boolean reinit) {
        if (reinit || !isAddrHeaderInitialized()) {
            initAddrHeader(reinit);
        }
        return addrHeader;
    }

    /**
     * Copy the address header into the destination buffer, initializing addrHeader if necessary.
     * IPV6_LENGTH bytes will be copied.
     * 
     * @param dstBuff
     * @param dstOffset
     */
    public static void copyAddrHeaderTo(byte[] dstBuff, int dstOffset) {
        if (dstBuff == null || dstBuff.length < IPV6_LENGTH + dstOffset) {
            throw new IllegalArgumentException("Destination buffer is null or too small");
        }
        byte[] addrHeader = getAddrHeader(false);
        System.arraycopy(addrHeader, 0, dstBuff, dstOffset, IPV6_LENGTH);
    }
}

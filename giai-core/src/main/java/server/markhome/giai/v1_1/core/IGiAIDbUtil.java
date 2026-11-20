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

import java.util.*;

/**
 *	IGiAIDbUtil provides a set of methods that provide useful constants used for persisting information that has a time zone.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIDbUtil extends IGiAIAnyObj {

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
	public static IGiAIDbUtil getService() {
		IGiAIDbUtil ref = ((IGiAIDbUtil)(singleton.get()));
		if (ref == null) {
			ref = new GiAIDbUtil();
			singleton.set(null, ref);
			ref = ((IGiAIDbUtil)(singleton.get()));
		}
		return(ref);
	}

	//protected final static IGiAIMtReference<TimeZone> tzUTC = IGiAIMtReference<TimeZone>.getSingleton().getInstance(TimeZone.getTimeZone("GMT+0000"));
	//protected final static IGiAIMtReference<Calendar> localCalendar = IGiAIMtReference<Calendar>.getSingleton().getInstance(new GregorianCalendar());
	//protected final static IGiAIMtReference<int> localTZOffsetMillis = IGiAIMtReference<int>.getSingleton().getInstance(localCalendar.get().get(Calendar.ZONE_OFFSET));
	//protected final static IGiAIMtReference<int> dbServerTZOffsetMillis = IGiAIMtReference<int>.getSingleton().getInstance(localTZOffsetMillis.get());
	//protected final static IGiAIMtReference<TimeZone> dbServerTimeZone = IGiAIMtReference<TimeZone>.getSingleton().getInstance((TimeZone)null);

	/**
	 *	Get the database server's timezone offset in milliseconds.
	 *
	 *	@return Timezone offset in milliseconds
	 */
	@JSExport
	public int getDbServerTZOffsetMillis() {
		return(GiAIDbUtil_getDbServerTZOffsetMillis());
	}

	/**
	 *	Get the database server's timezone offset in milliseconds.
	 *
	 *	@return Timezone offset in milliseconds
	 */
	@JSExport
	public static int GiAIDbUtil_getDbServerTZOffsetMillis() {
		return(dbServerTZOffsetMillis.get());
	}

	/**
	 *	Set the database server's timezone offset in milliseconds.
	 *
	 *	@param value Timezone offset in milliseconds
	 */
	@JSExport
	public void setDbServerTZOffsetMillis(int expected, int value) {
		GiAIDbUtil_setDbServerTZOffsetMillis(expected, value);
	}

	/**
	 *	Set the database server's timezone offset in milliseconds.
	 *
	 *	@param value Timezone offset in milliseconds
	 */
	public static void GiAIDbUtil_setDbServerTZOffsetMillis(int expected, int value) {
		dbServerTZOffsetMillis.set(expected, value);
		dbServerTimeZone.set(dbServerTimeZone.get(), null);
	}

	/**
	 *	Get the database server's timezone.
	 *
	 *	@return Database server timezone
	 */
	@JSExport
	public TimeZone getDbServerTimeZone() {
		return(GiAIDbUtil_getDbServerTimeZone());
	}

	/**
	 *	Get the database server's timezone.
	 *
	 *	@return Database server timezone
	 */
	@JSExport
	public static TimeZone GiAIDbUtil_getDbServerTimeZone() {
		if(dbServerTimeZone.get() == null) {
			int secondsOnly = dbServerTZOffsetMillis.get() / 1000;
			int minutesOnly = secondsOnly / 60;
			int absMinutes = (minutesOnly < 0) ? (0 - minutesOnly) : minutesOnly;
			int minutes = absMinutes % 60;
			int hours = absMinutes / 60;
			StringBuilder buff = new StringBuilder();
			Formatter fmt = new Formatter(buff);
			if(minutesOnly < 0) {
				buff.append("GMT-");
			}
			else {
				buff.append("GMT+");
			}
			fmt.format("%1$02d", hours);
			fmt.format("%1$02d", minutes);
			dbServerTimeZone.set(dbServerTimeZone.get(), TimeZone.getTimeZone(buff.toString()));
			fmt.close();
		}
		return(dbServerTimeZone.get());
	}

	/**
	 *	Set the database server's timezone.
	 *
	 *	@param tz Database server timezone
	 *
	 *	@return Database server timezone
	 */
	@JSExport
	public TimeZone setDbServerTimeZone(TimeZone expected, TimeZone tz) {
		return(GiAIDbUtil_setDbServerTimeZone(expected, tz));
	}

	/**
	 *	Set the database server's timezone.
	 *
	 *	@param tz Database server timezone
	 *
	 *	@return Database server timezone
	 */
	@JSExport
	public static TimeZone GiAIDbUtil_setDbServerTimeZone(TimeZone expected, TimeZone tz) {
		if(tz == null) {
			throw new IllegalArgumentException("TimeZone tz is null");
		}
		dbServerTimeZone.set(expected, tz);
		dbServerTZOffsetMillis.set(dbServerTZOffsetMillis.get(), tz.getRawOffset());
		return(dbServerTimeZone.get());
	}

	/**
	 *	Get a database server adjusted Calendar instance.
	 *
	 *	@param Calendar value to be adjusted
	 *
	 *	@return Database server adjusted Calendar instance.
	 */
	@JSExport
	public Calendar getDbServerCalendar(Calendar value) {
		return(GiAIDbUtil_getDbServerCalendar(value));
	}

	/**
	 *	Get a database server adjusted Calendar instance.
	 *
	 *	@param Calendar value to be adjusted
	 *
	 *	@return Database server adjusted Calendar instance.
	 */
	@JSExport
	public static Calendar GiAIDbUtil_getDbServerCalendar(Calendar value) {
		if(value == null) {
			return(null);
		}
		Calendar cal = Calendar.getInstance(getDbServerTimeZone());
		cal.setTimeInMillis(value.getTimeInMillis());
		return(cal);
	}

	/**
	 *	Get a UTC adjusted Calendar instance.
	 *
	 *	@param Calendar value to be adjusted
	 *
	 *	@return UTC adjusted Calendar instance.
	 */
	@JSExport
	public Calendar GiAIDbUtil_getUTCCalendar(Calendar value) {
		return(GiAIDbUtil_getUTCCalendar(value));
	}

	/**
	 *	Get a UTC adjusted Calendar instance.
	 *
	 *	@param Calendar value to be adjusted
	 *
	 *	@return UTC adjusted Calendar instance.
	 */
	@JSExport
	public static Calendar GiAIDbUtil_getUTCCalendar(Calendar value);// {
//		if(value == null) {
//			return(null);
//		}
//		Calendar cal = Calendar.getInstance(tzUTC);
//		cal.setTimeInMillis(value.getTimeInMillis());
//		return(cal);
//	}

	/**
	 *	Get a UTC adjusted LocalDate instance.
	 *
	 *	@param LocalDate value to be adjusted
	 *
	 *	@return UTC adjusted LocalDate instance.
	 */
	@JSExport
	public LocalDate getUTCLocalDate(LocalDate value);// {
//		return(GiAIDbUtil_getUTCLocalDate(LocalDate value));
//	}

	/**
	 *	Get a UTC adjusted LocalDate instance.
	 *
	 *	@param LocalDate value to be adjusted
	 *
	 *	@return UTC adjusted LocalDate instance.
	 */
	@JSExport
	public static LocalDate GiAIDbUtil_getUTCLocalDate(LocalDate value) {
		if(value == null) {
			return(null);
		}
		LocalDate cal = LocalDate.getInstance(getDbServerTimeZone());
		cal.setTimeInMillis(value.getTimeInMillis());
		return(cal);
	}

	public static LocalDate GiAIDbUtil_setUTCLocalDate(LocalDate expected, LocalDate value);// {
//		if(value == null) {
//			return(null);
//		}
//		LocalDate cal = LocalDate.getInstance(tzUTC);
//		cal.setTimeInMillis(value.getTimeInMillis());
//		return(cal);
//	}

	public static LocalTime GiAIDbUtil_getDbServerLocalTime(LocalTime value) {
		if(value == null) {
			return(null);
		}
		LocalTime cal = LocalTime.getInstance(getDbServerTimeZone());
		cal.setTimeInMillis(value.getTimeInMillis());
		return(cal);
	}

	public static LocalTime GiAIDbUtil_getUTCLocalTime(LocalTime value);// {
//		if(value == null) {
//			return(null);
//		}
//		LocalTime cal = LocalTime.getInstance(tzUTC);
//		cal.setTimeInMillis(value.getTimeInMillis());
//		return(cal);
//	}

	public static LocalDateTime GiAIDbUtil_getDbServerLocalDateTime(LocalDateTime value) {
		if(value == null) {
			return(null);
		}
		LocalDateTime cal = LocalDateTime.getInstance(getDbServerTimeZone());
		cal.setTimeInMillis(value.getTimeInMillis());
		return(cal);
	}

	public static LocalDateTime GiAIDbUtil_getUTCLocalDateTime(LocalDateTime value);// {
//		if(value == null) {
//			return(null);
//		}
//		LocalDateTime cal = LocalDateTime.getInstance(tzUTC);
//		cal.setTimeInMillis(value.getTimeInMillis());
//		return(cal);
//	}
}

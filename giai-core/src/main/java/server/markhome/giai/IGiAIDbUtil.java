/**
 *	server.markhome.giai-core - Guided Intelligence Architecture Implementation Core Services
 *
 *	Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://apache.org
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: Apache-2.0
**/

package server.markhome.giai;

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
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance();

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

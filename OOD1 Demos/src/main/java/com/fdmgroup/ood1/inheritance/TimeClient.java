/**
 * TimeClient.java
 * - demonstrates an interface
 */


package com.fdmgroup.ood1.inheritance;

import java.time.*;



public interface TimeClient {
	void setTime(int hour, int minute, int second);

	void setDate(int day, int month, int year);

	void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

	LocalDateTime getLocalDateTime();
	
	
	
	// What if a new abstract method was added ?? ////////////////////////
	// ... it would necessitate all implementing classes 
	// ... to now also implement the new method
	
//	ZonedDateTime getZonedDateTime(String zoneString);
	
	
	// ... alternatively, java added the 'default' modifier
	// ... to provide implementations to an interface!!
		
//	static ZoneId getZoneId(String zoneString) {
//		try {
//			return ZoneId.of(zoneString);
//		} catch (DateTimeException e) {
//			System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
//			return ZoneId.systemDefault();
//		}
//	}
//
//	default ZonedDateTime getZonedDateTime(String zoneString) {
//		return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
//	}
}
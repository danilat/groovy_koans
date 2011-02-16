package koans

import static java.util.Calendar.*

/*
* Groovy Dates
*
* Instructions: Replace __ with your answer.
*
* For more information, See:
* - http://groovy.codehaus.org/JN0545-Dates
* - http://groovy.codehaus.org/groovy-jdk/java/util/Date.html
* - http://download.oracle.com/javase/6/docs/api/java/util/Date.html 
* - http://groovy.codehaus.org/groovy-jdk/java/util/Calendar.html
* - http://download.oracle.com/javase/6/docs/api/java/util/Calendar.html
*
*/
class DateKoans extends Koans {
	// Creating Dates
	void testParseStringToDate() {
		def date = new Date().parse('yyyy/MM/dd', '2001/09/11')
		assert __ == date.class.name
		assert __ == date.year
		assert __ == date.month
		assert __ == date.date
		assert __ == date.hours
		assert __ == date.minutes
	}
	
	void testDateSetter() {
		def date2 = new Date()
		date2.year = 101
		date2.month = SEPTEMBER
		date2.date = 11
		date2.hours = 0
		date2.minutes = 0
		date2.seconds = 0
		assert __ == date2.year
		assert __ == date2.month
		assert __ == date2.date
		assert __ == date2.hours
		assert __ == date2.minutes
	}
	
	void testClearTime() {
		def date = new Date()
		date.clearTime()
		assert __ == date.hours
		assert __ == date.minutes
		assert __ == date.seconds
	}
	
	// accessors
	void testDateFieldAccessLikeMap() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		assert __ == date[YEAR]
		assert __ == date[MONTH]
		assert __ == date[DATE]
		assert __ == date[HOUR]
		assert __ == date[MINUTE]
		assert __ == date[SECOND]
	}
	
	void testDateStringGetters() {
		def date = new Date(year: 41, month: DECEMBER, date: 07, hours:7, minutes: 55, seconds: 0)
		assert __ == date.dateString	
		assert __ == date.timeString 
		assert __ == date.dateTimeString
	}
	
	// Compare Dates
	void testCompareDates() {
		def date = new Date(year: 101, month: SEPTEMBER, date: 11, hours:0, minutes: 0, seconds: 0)
		def datePlusOne = date + 1
		def dateMinusOne = date - 1
		
		assert __.after(date)
		assert __.before(date)
		assert __.compareTo(date) > 0
		assert __.compareTo(date) < 0
		assert __.compareTo(date) == 0
	}

}

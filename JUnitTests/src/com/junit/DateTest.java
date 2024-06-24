package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DateTest {

	Date date;
	
	@BeforeEach
	void init() {
	  date=new Date(22, 6, 2024);
	}

	@Test
	@Order(1)
	@DisplayName("Get Day")
	void testGetIntDay() {
		int day=date.getIntDay();
		assertEquals(22, day);
	}

	@Test
	@Order(2)
	@DisplayName("Set Day")
	void testSetIntDay() {
		date.setIntDay(25);
		int day=date.getIntDay();
		assertEquals(25, day);
	
	}

	@Test
	@Order(3)
	@DisplayName("Get Month")
	void testGetIntMonth() {
		int month=date.getIntMonth();
		assertEquals(6, month);
		
	}

	@Test
	@Order(4)
	@DisplayName("Set Month")
	void testSetIntMonth() {
		date.setIntMonth(10);
		int month=date.getIntMonth();
		assertEquals(10, month);
	
	}

	@Test
	@Order(5)
	@DisplayName("Get Year")
	void testGetIntYear() {
		int year=date.getIntYear();
		assertEquals(2024, year);
	
	}

	@Test
	@Order(6)
	@DisplayName("Set Year")
	void testSetIntYear() {
		date.setIntYear(2025);
		int year=date.getIntYear();
		assertEquals(2025, year);
		
	}

	@Test
	@Order(7)
	@DisplayName("Get Date")
	void testToString() {
		String date1=date.toString();
		assertEquals("Date [intDay=22, intMonth=6, intYear=2024]", date1);
		
	}

}

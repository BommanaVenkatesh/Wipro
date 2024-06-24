package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonTest {
Person person;

    @BeforeEach
	void init() {
		person=new Person("Venkatesh","Bommana");
	}

	@Test
	@Order(1)
	@DisplayName("Get Full Name")
	void testGetFullName() {
		String fullName=person.getFullName();
		assertEquals("Venkatesh Bommana", fullName);
	}

	@Test
	@Order(2)
	@DisplayName("Get First Name")
	void testGetFirstName() {
		String firstName=person.getFirstName();
		assertEquals("Venkatesh", firstName);
		
	}

	@Test
	@Order(3)
	@DisplayName("Get Last Name")
	void testGetLastName() {
		String lastName=person.getLastName();
		assertEquals("Bommana", lastName);
	}
	
	@Test
	@Order(4)
	@DisplayName("Throw an Error If Invalid firstname or Lastname")
	void throwErrorInvalidName() {
		person =new Person(null, "Bommana");
		assertThrows(NameNotFoundException.class, ()->person.getFullName());
	}
	
	@Test
	@Order(5)
	@DisplayName("Throw an Error if Invalid firstName and LastName")
	void throwErrorInavlidFirstAndLastName() {
		assertThrows(IllegalArgumentException.class, ()->new Person(null,null));
	}
}

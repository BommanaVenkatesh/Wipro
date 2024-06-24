package com.junit;

public class Person 

{ 
private String firstName; 
private String lastName; 
public Person(String fname,String lname) 
{ 
      if(fname == null &&lname==null){ 
      throw new IllegalArgumentException("Both Names Cannot be NULL"); 
      } 
      this.firstName=fname; 
      this.lastName = lname; 
   } 
      public String getFullName() {
    	    if(this.firstName==null ||this.lastName==null) {
    	    	throw new NameNotFoundException("Name Not Found");
    	    }
          return this.firstName + " " + this.lastName; 
    } 
   public String getFirstName(){ 
      return this.firstName; 
   } 
    public String getLastName(){ 
    return this.lastName; 
   } 
} 


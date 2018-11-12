package newHW3;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Locale;

//Exercise 10.8 Solution: Employee.java
//Employee abstract superclass.

public abstract class Employee implements Comparable<Employee> 
{
private String firstName;
private String lastName;
private int socialSecurityNumber;
private Date2 birthDate;
private Date2 dateOfAppointment;
private name named = new name();
// six-argument constructor
public Employee(name n, int ssn, 
   int month, int day, int year,int month2, int day2, int year2 )
{	named=n;
   socialSecurityNumber = ssn;
   birthDate = new Date2( month, day, year );
   dateOfAppointment = new Date2(month2, day2, year2);
  } // end six-argument Employee constructor

//calculate appointment OF DAY
public double CalculateAppointmentDate()
{
	LocalDate time = LocalDate.now();
	LocalDate appoointmentDate = LocalDate.of(dateOfAppointment.getYear(), dateOfAppointment.getMonth(), dateOfAppointment.getDay());
	Period period = Period.between(appoointmentDate, time);
	if(period.getYears()>=10) return 1.1;
	else return 1;
}
//calculate birthday
public int CalculateBirth()
{
	LocalDate time = LocalDate.now();
	LocalDate birth = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDay());
	if(birth.getMonth()==time.getMonth()) return 100;
	else return 0;
}

// set first name
public void setFirstName( String first )
{
   firstName = first;
} // end method setFirstName

// return first name
public String getFirstName()
{
   return firstName;
} // end method getFirstName

// set last name
public void setLastName( String last )
{
   lastName = last;
} // end method setLastName

// return last name
public String getLastName()
{
   return lastName;
} // end method getLastName

// set social security number
public void setSocialSecurityNumber( int ssn )
{
   socialSecurityNumber = ssn;  // should validate
} // end method setSocialSecurityNumber

// return social security number
public int getSocialSecurityNumber()
{
   return socialSecurityNumber;
} // end method getSocialSecurityNumber

// set birth date
public void setBirthDate( int month, int day, int year )
{
   birthDate = new Date2( month, day, year );
} // end method setBirthDate

// return birth date
public Date2 getBirthDate()
{
   return birthDate;
} // end method getBirthDate

// return String representation of Employee object
@Override
public String toString()
{
   return String.format( "%s %s\n%s: %s\n%s: %s", 
      named.getFirstName(), named.getLastName(), 
      "social security number", getSocialSecurityNumber(), 
      "birth date", getBirthDate() );
} // end method toString

// abstract method overridden by subclasses
public abstract double earnings();

@Override
	public int compareTo(Employee o) {
		if(getSocialSecurityNumber()>o.getSocialSecurityNumber())return 1;
		else if(getSocialSecurityNumber()==o.getSocialSecurityNumber())return 0;
		else return -1;
	}
} // end abstract class Employee

/**************************************************************************
* (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/ 

package newHW3;


//Exercise 10.8 Solution: BasePlusCommissionEmployee.java
//BasePlusCommissionEmployee class derived from CommissionEmployee.

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
private double baseSalary; // base salary per week

// nine-argument constructor
public BasePlusCommissionEmployee( name n, 
   int ssn, int month, int day, int year, int month2, int day2, int year2, 
   double sales, double rate, double salary )
{
   super( n, ssn, month, day, year,month2, day2, year2, sales, rate );
   setBaseSalary( salary );
} // end nine-argument BasePlusCommissionEmployee constructor

// set base salary
public void setBaseSalary( double salary )
{
   baseSalary = salary < 0.0 ? 0.0 : salary; // non-negative
} // end method setBaseSalary

// return base salary
public double getBaseSalary()
{
   return baseSalary;
} // end method getBaseSalary

// calculate earnings; override method earnings in CommissionEmployee
@Override
public double earnings()
{
   return (int)(getBaseSalary()*CalculateAppointmentDate()) + super.earnings();
} // end method earnings

// return String representation of BasePlusCommissionEmployee object
@Override
public String toString()
{
   return String.format( "%s %s; %s: $%,.2f", 
      "base-plussalaried", super.toString(), 
      "base salary", getBaseSalary() );
   } // end method toString
} // end class BasePlusCommissionEmployee

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

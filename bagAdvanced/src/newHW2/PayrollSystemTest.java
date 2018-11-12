package newHW2;

//Exercise 10.8 Solution: PayrollSystemTest.java
//Employee hierarchy test program.
import java.util.Scanner; // program uses Scanner to obtain user input

public class PayrollSystemTest 
{
public static void main( String[] args ) 
{
   // create subclass objects
	name n1 = new name( "John", "Smith");
	name n2 = new name( "Karen", "Price");
	name n3 = new name( "Sue", "Jones");
	name n4 = new name( "Bob", "Lewis");
	name n5 = new name( "Sam", "Kim");
	name n6 = new name( "John", "Smith");
	name n7 = new name( "Andrew", "Smith");
	name n8 = new name( "Dol", "Ala");
	name n9 = new name( "John", "Brown");
	name n10 = new name( "Roll", "Ample");
   SalariedEmployee salariedEmployee = 
      new SalariedEmployee( 
      n1, "111-11-1111", 3, 23, 1944,7,10,2007, 800.00 );
   HourlyEmployee hourlyEmployee = 
      new HourlyEmployee( 
      n2, "222-22-2222", 12, 29, 1960,7,10,1995, 16.75, 40 );
   CommissionEmployee commissionEmployee = 
      new CommissionEmployee( 
      n3, "333-33-3333", 9, 8, 1954,7,10,1995, 10000, .06 );
   BasePlusCommissionEmployee basePlusCommissionEmployee = 
      new BasePlusCommissionEmployee( 
      n4, "444-44-4444", 3, 2, 1965,7,10,1995, 5000, .04, 300 );
   
   SalariedEmployee salariedEmployee2 = 
		      new SalariedEmployee( 
		      n5, "555-55-5555", 3, 22, 1950,9,20,2005, 700.00 );
		   HourlyEmployee hourlyEmployee2 = 
		      new HourlyEmployee( 
		     n6, "666-66-6666", 10, 11, 1990,6,10,2010, 16.75, 40 );
		   CommissionEmployee commissionEmployee2 = 
		      new CommissionEmployee( 
		     n7, "777-77-7777", 2, 22, 1993,7,10,2016, 10000, .06 );
		   BasePlusCommissionEmployee basePlusCommissionEmployee2 = 
		      new BasePlusCommissionEmployee( 
		      n8, "888-88-8888", 6, 2, 1975,7,10,1995, 5000, .04, 400 );
		   
		   SalariedEmployee salariedEmployee3 = 
				      new SalariedEmployee( 
				     n9, "999-99-9999", 6, 12, 1979,7,10,2015, 800.00 );
				   HourlyEmployee hourlyEmployee3 = 
				      new HourlyEmployee( 
				     n10, "000-00-0000", 3, 22, 1980,7,10,1975, 16.75, 40 );

				   BagEmployee bem = new BagEmployee();
				   add(bem,salariedEmployee);
				   add(bem,hourlyEmployee);
				   add(bem,commissionEmployee);
				   add(bem,basePlusCommissionEmployee);
				
					while(!bem.isEmpty())
					{
						   Employee em = bem.remove();
						 System.out.println(em.toString());
						 System.out.println("Wage is: "+(int)em.earnings());
						 
						   System.out.println();	  
					}	
						 
				  
   /*System.out.println( "Employees processed individually:\n" );
   
   System.out.printf( "%s\n%s: $%,.2f\n\n", 
      salariedEmployee, "earned", salariedEmployee.earnings() );
   System.out.printf( "%s\n%s: $%,.2f\n\n",
      hourlyEmployee, "earned", hourlyEmployee.earnings() );
   System.out.printf( "%s\n%s: $%,.2f\n\n",
      commissionEmployee, "earned", commissionEmployee.earnings() );
   System.out.printf( "%s\n%s: $%,.2f\n\n", 
      basePlusCommissionEmployee, 
      "earned", basePlusCommissionEmployee.earnings() );
   System.out.printf( "%s\n%s: $%,.2f\n\n", 
		      salariedEmployee2, "earned", salariedEmployee2.earnings() );
		   System.out.printf( "%s\n%s: $%,.2f\n\n",
		      hourlyEmployee2, "earned", hourlyEmployee2.earnings() );
		   System.out.printf( "%s\n%s: $%,.2f\n\n",
		      commissionEmployee2, "earned", commissionEmployee2.earnings() );
		   System.out.printf( "%s\n%s: $%,.2f\n\n", 
		      basePlusCommissionEmployee2, 
		      "earned", basePlusCommissionEmployee2.earnings() );
		   System.out.printf( "%s\n%s: $%,.2f\n\n", 
				      salariedEmployee3, "earned", salariedEmployee3.earnings() );
				   System.out.printf( "%s\n%s: $%,.2f\n\n",
				      hourlyEmployee3, "earned", hourlyEmployee3.earnings() );
				    Employee[] employees = new Employee[ 10 ]; 
				   employees[ 0 ] = salariedEmployee;
				      employees[ 1 ] = salariedEmployee;
				      employees[ 2 ] = hourlyEmployee; 
				      employees[ 3 ] = commissionEmployee;
				      employees[ 4 ] = basePlusCommissionEmployee;
				      employees[ 5 ] = hourlyEmployee2;
				      employees[ 6 ] = commissionEmployee2; 
				      employees[ 7 ] = basePlusCommissionEmployee2;
				      employees[ 8 ] = salariedEmployee3;
				      employees[ 9 ] = hourlyEmployee3;
			
				      System.out.println( "Employees processed polymorphically:\n" );
				      
				      // generically process each element in array employees
				      for ( Employee currentEmployee : employees ) 
				      {
				         System.out.println( currentEmployee ); // invokes toString

				         // determine whether element is a BasePlusCommissionEmployee
				         if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
				         {
				        	 System.out.printf( "%s\n%s: $%,.2f\n\n",
				        		      currentEmployee, "earned", currentEmployee.earnings() );
				         }
				         else if ( currentEmployee instanceof SalariedEmployee ) 
				         {
				        	 System.out.printf( "%s\n%s: $%,.2f\n\n",
				        		      currentEmployee, "earned", currentEmployee.earnings() );
				        	 
				         }
				         else if ( currentEmployee instanceof HourlyEmployee ) 
				         {
				        	 System.out.printf( "%s\n%s: $%,.2f\n\n",
				        		      currentEmployee, "earned", currentEmployee.earnings() );
				         }
				         else if ( currentEmployee instanceof CommissionEmployee ) 
				         {
				        	 System.out.printf( "%s\n%s: $%,.2f\n\n",
				        		      currentEmployee, "earned", currentEmployee.earnings() );
				         }
				        
				      } // end for

				      // get type name of each object in employees array
				      for ( int j = 0; j < employees.length; j++ )
				         System.out.printf( "Employee %d is a %s\n", j, 
				            employees[ j ].getClass().getName() ); */

				     
  
} // end main
	private static void add(BagEmployee bem, Employee emp)
	{
		if(bem.add(emp))System.out.println("Added a "+emp.getClass().getName());
		else System.out.println("unable to add");
		System.out.println();
	}
} // end class PayrollSystemTest

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
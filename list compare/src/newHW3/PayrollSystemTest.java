package newHW3;


import java.util.Random;
//Exercise 10.8 Solution: PayrollSystemTest.java
//Employee hierarchy test program.
import java.util.Scanner; // program uses Scanner to obtain user input


public class PayrollSystemTest 
{
public static void main( String[] args ) 
{
	String named;
	String name2;
	int a;
	int b;
	int c;
	int d;
	int e;
	
	int f, g, h, i,e2,f2,d2;
	int t1, t2;
	ArrayList<Employee> al = new ArrayList<>();
   // create subclass objects
	for(int z=0; z<100; z++)
	{
		 a= (int)Math.floor((Math.random()*67));
		b=(int)Math.floor((Math.random()*67));
		named = getRandomString();
		
		name2 = getRandomString();
		name n = new name(named,name2);
		c = (int)Math.floor(Math.random()*67);
		d = (int) Math.floor(Math.random()*1990);
		e = (int) Math.floor(Math.random()*12+1);
		f = (int) Math.floor(Math.random()*30+1);
		d2 = (int) Math.floor(Math.random()*1990);
		e2 = (int) Math.floor(Math.random()*12+1);
		f2 = (int) Math.floor(Math.random()*30+1);
		g = (int) Math.floor(Math.random()*4);
		i = (int)Math.floor(Math.random()*5000+200);
		t1 = (int)Math.floor(Math.random()*10+1);
		t2 = (int)Math.floor(Math.random()*60+1);
		switch(g)
		{
		case 0:
			Employee a1 = new SalariedEmployee(n, z+1234567, e, f, d, e2, f2, d2, i);
			al.add(a1);
			break;
		case 1:
			Employee a2 = new HourlyEmployee(n, z+1234567, e, f, d, e2, f2, d2,t1,t2);
			al.add(a2);
			break;
		case 2:
			Employee a3 = new CommissionEmployee(n, z+1234567, e, f, d, e2, f2, d2, i,0.2);
			al.add(a3);
			break;
		case 3:
			Employee a4 = new BasePlusCommissionEmployee(n, z+1234567, e, f, d, e2, f2, d2, i,0.2,50);
			al.add(a4);
			break;
		
		}
		
	}
		al.swap();
		long startTime = System.currentTimeMillis();
		al.qSort(1, al.getLength());
		long endTime = System.currentTimeMillis();
		long elaspedTime = endTime - startTime;
		System.out.println("걸린시간: "+elaspedTime+"ms");
			int numbr = al.getLength();
			for(int i2=1; i2<=numbr; i2++)
			{
				System.out.println(al.getEntry(i2));
				System.out.println();
			}
				
					//BagImplement<Employee> bem = new BagImplement<Employee>();
					

				     
  
} // end main

private static String getRandomString()
{
 StringBuffer str =new StringBuffer();
  
 int pp;
  String chars = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
 String[] chars2; 
 chars2=chars.split(",");

 for (int i=0 ; i<80 ; i++)
  {
	  pp=(int)Math.floor(Math.random()*(chars2.length-1)*25);

	  if(pp<chars2.length)
    str.append(chars2[pp]);
  }


  return str.toString();
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
package newHW3;

import java.util.Arrays;
import java.util.Collections;

import javax.xml.transform.Templates;

public class ArrayList<T> implements ListInterface<T> {
	
	private T[] list;
	private int numberOfEntries;
	private static final int CAPACITY = 25;
	private static final int MAX_CAPACITY = 100001;
	
	public ArrayList() {
		// TODO Auto-generated constructor stub
		this(CAPACITY);
	}
	public ArrayList(int initial)
	{	
		@SuppressWarnings("unchecked")
		T[] tempList = (T[])new Object[initial+1];
		list  = tempList;
		numberOfEntries =0;
	}
	
	@Override
	public void add(T newEntry) {
		ensureCapacity();
		list[numberOfEntries+1] = newEntry;
		
		numberOfEntries++;
		sort();
		
		
	}
	public void swap()
	{
		int k;
		for(int i=1; i<=numberOfEntries/2;i++)
		{
			k=(int)Math.floor(Math.random()*numberOfEntries+1);
			if(k<=numberOfEntries)
			{
				T c = list[i];
				list[i]=list[k];
				list[k]=c;
			}
		}
	}
	public void sort ()
	{	
		if(numberOfEntries>1)
		{
			for(int i=1; i<=numberOfEntries; i++)
			{
				
				for(int j=1; j<numberOfEntries; j++)
				{
					Employee a = (Employee)list[j+1];
					Employee b = (Employee)list[j];
					T temp;
					if(a.getSocialSecurityNumber()<b.getSocialSecurityNumber())
					{
						temp=list[j];
						list[j]=list[j+1];
						list[j+1]=temp;
						
					}
				}
			}
		}
	}
	@Override
	public void add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		if((newPosition>=1) && (newPosition <= numberOfEntries+1))
		{
			if((newPosition <= numberOfEntries))
			{
				makeRoom(newPosition);
			}
			list[newPosition] = newEntry;
			numberOfEntries++;
			
		}
		
	}
	private void makeRoom(int newPosition)
	{
		assert (newPosition>=1) && (newPosition <=numberOfEntries+1);
		int newIndex = newPosition;
		int lastIndex = numberOfEntries;
		for(int i = lastIndex; i>=newIndex; i--)
		{
			list[i+1] = list[i];
		}
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		int index =1;
		while(!found && (index<=numberOfEntries))
		{
			if(anEntry.equals(list[index]))
				found = true;
			index++;
		}
		return found;
	}
	@Override
	public T getEntry(int givenPositon) {
		if((givenPositon>=1) && (givenPositon<=numberOfEntries)) 
		{
			assert !isEmpty();
			return list[givenPositon];
		}
		else throw new IndexOutOfBoundsException("Illegal positon given to getEntry poeration");
	}
	@Override
	public int getLength() {
		return numberOfEntries;
	}
	@Override
	public boolean isEmpty() {
		return numberOfEntries==0;
	}
	@Override
	public T remove(int givenPositon) {
		if((givenPositon>=1) && (givenPositon<=numberOfEntries))
		{
			assert !isEmpty();
			T result = list[givenPositon];
			if(givenPositon<numberOfEntries)
				removeGap(givenPositon);
			numberOfEntries--;
			return result;
		}
		else throw new IndexOutOfBoundsException("Illegal positon given to remove poeration");
	}
	private void removeGap(int givenPosition)
	{
		assert(givenPosition>=1) && (givenPosition<numberOfEntries);
	}
	@Override
	public T replace(int givenPosition, T newEntry) {
		if((givenPosition>=1) && (givenPosition<=numberOfEntries))
		{
			assert !isEmpty();
			T originalEntry = list[givenPosition];
			list[givenPosition] = newEntry;
			return originalEntry;
		}
		else throw new IndexOutOfBoundsException("Illegal positon given to replace poeration");
	}
	
	@Override
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[numberOfEntries];
		for(int i=0; i<numberOfEntries; i++)
		{
			result[i]=list[i+1];
		}
		return result;
		
	}
	private void ensureCapacity()
	{
		int capacity = list.length-1;
		if(numberOfEntries >=capacity)
		{
			int newCapacity = 2*capacity;
			list = Arrays.copyOf(list, newCapacity+1);
		}
	}

	@Override
	public void iSort() {
		for(int index = 2 ; index <= numberOfEntries ; index++){
			  int aux = index - 1;
			  Employee temp = (Employee)list[index];
	    	  Employee temp2 = (Employee)list[aux];
		      T a=list[index];
		      do 
		      {
		    	 temp2 = (Employee)list[aux];
		    	  if(temp2.getSocialSecurityNumber() > temp.getSocialSecurityNumber())
		    	  {
		    		  a=list[index];
		    		 list[aux+1]=list[aux];
		    		  aux--;
		    	  }
		    	  
		      }while( (aux >1) && ( temp2.getSocialSecurityNumber() > temp.getSocialSecurityNumber()) ) ;
		      list[aux+1]=a;
		   }
	}
	/*public void iSort(int first, int last) {
		for(int index = first+1 ; index <= last ; index++){
			  int aux = index - 1;
			  Employee temp = (Employee)list[index];
	    	  Employee temp2 = (Employee)list[aux];
		      T a;
		      do 
		      {
		    	  temp2 = (Employee)list[aux];
		    	  if(temp2.getSocialSecurityNumber() > temp.getSocialSecurityNumber())
		    	  {
		    		  a=list[index];
		    		  list[index]=list[aux];
		    		  list[aux]=a;
		    		  aux--;
		    	  }
		    	  
		      }
		      while( (aux >= 1) && ( temp2.getSocialSecurityNumber() > temp.getSocialSecurityNumber()) ) ;
		   }
	}
*/

	
	@Override
	public void qSort(int first, int last) {
	        int left = first;
	        int right = last;
	        Employee pivot = (Employee)list[(first+last)/2];
	  
	        do{
	        	Employee tempL = (Employee)list[left];
	        	Employee tempR = (Employee)list[right];
	            while(tempL.getSocialSecurityNumber() < pivot.getSocialSecurityNumber())
	            	{
	            	left++;
	            	tempL = (Employee)list[left];
	            	}
	            while(tempR.getSocialSecurityNumber() > pivot.getSocialSecurityNumber()) 
	            	{
	            	right--;
	            	tempR = (Employee)list[right];
	            	}
	          
	            if(left <= right){    
	            
	                T temp = list[left];
	                list[left] = list[right];
	                list[right] = temp;
	                left++;
	                right--;
	            }
	        }while (left <= right);
	        
	        if(first < right) qSort(first, right);
	        if(last > left) qSort(left, last);
		
	}
	
	
	
}

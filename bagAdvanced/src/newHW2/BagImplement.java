package newHW2;

import java.util.Random;

public class BagImplement<T> implements BagInterface<T>
{
	private int		currrentSize;	
	private T[]		contents;
	private T[]		copy;
	private int ridx;
	private int copysize;
	private static int CAPACITY=10;
	
	@SuppressWarnings("unchecked")
	public BagImplement() {
		contents=(T[])new Object[CAPACITY];
		copy=(T[])new Object[CAPACITY];
	}
	
	public boolean add(T newEntry) {
		boolean result = true;
		if(currrentSize>CAPACITY){
			result=false;
		}
		else {
			contents[currrentSize]=newEntry;
			currrentSize++;
		
		}
		return result;
	};
	@Override
	public boolean isEmpty() {
		
		if(currrentSize==0) return true;
		else return false;
	}
	@Override
	public T remove() {
		T result =null;
		if(!isEmpty())
		{
			result=contents[currrentSize-1];
			contents[currrentSize-1]=null;
			currrentSize--;
			copy[copysize++]=result;
			
		}
		return result;
	}
	
}
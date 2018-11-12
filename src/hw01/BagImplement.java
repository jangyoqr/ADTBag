package hw01;

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
		else contents[currrentSize++]=newEntry;
		return result;
	};
	@Override
	public boolean isEmpty() {
		
		if(currrentSize==0) return true;
		else return false;
	}
	@Override
	public T remove() {
		if(isEmpty())
		{
			return null;
		}
		else
		{
			ridx= (int) (Math.random() * 1000000)%currrentSize;
			T ritem=contents[ridx];
			contents[ridx]=contents[currrentSize];
			currrentSize--;
			copy[copysize++]=ritem;
			return ritem;
			}
	}
	
}
package newHW3;

public interface ListInterface<T> {

	public void add(T newEntry);
	public void add(int newPosition, T newEntry);
	public T remove(int givenPositon);
	public void clear();
	public T replace(int givenPosition,T newEntry);
	public T getEntry(int givenPositon);
	public T[] toArray();
	public boolean contains(T anEntry);
	public int getLength();
	public boolean isEmpty();
	public void iSort();
	public void qSort( int first, int last);
	
}

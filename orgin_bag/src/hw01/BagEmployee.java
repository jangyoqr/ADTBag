package hw01;

public class BagEmployee 
{
	private BagInterface<Employee> member;
	public BagEmployee() {
		member = new BagImplement<>();
	}
	public boolean add(Employee mem)
	{
		return member.add(mem);
	}
	public Employee remove()
	{
		return member.remove();
	}
	public boolean isEmpty()
	{
		return member.isEmpty();
	}
}

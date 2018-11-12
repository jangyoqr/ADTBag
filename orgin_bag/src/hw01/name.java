package hw01;

public class name {
	private String firstname;
	private String lastname;
	public name(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public name(){}
	public String  getFirstName(){
		return firstname;
	}
	public String getLastName(){
		return lastname;
	}
	public void setFirstname(String n)
	{
		this.firstname=n;
	}
	public void setLastname(String n)
	{
		this.lastname=n;
	}
}

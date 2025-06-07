package project;

public class contact {
	private	 String name;
	private String number;
	
	contact(String name,String number)
	{
		this.name=name;
		this.number=number;
	}
	
	public void setname(String name) {
		this.name=name;
		
	}
	public void setnumber(String number) {
		this.number=number;
	}
	public String getname() {
		return this.name;
	}
	public String getnumber() {
		return this.number;
	}
	
	public String toString() {
		return this.name+" : "+this.number;
	}
}

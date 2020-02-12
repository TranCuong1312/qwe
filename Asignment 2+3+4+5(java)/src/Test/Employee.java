package Test;

public class Employee {
	private String name, address;
	protected int basicSalary;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getBasicSalary() {
		return basicSalary;
	}
	
	public void setName(String nm) {
		name=nm;
	}
	
	public void setAddress(String ad) {
		address=ad;
	}
	
	public void setBasicSalary(int bs) {
		basicSalary=bs;
	}
}

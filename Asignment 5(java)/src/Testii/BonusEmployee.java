package Testii;

import Test.Employee;

public class BonusEmployee extends Employee{
	@Override 
	public int getBasicSalary() {
		System.out.println("Bonus");
		return basicSalary;
	}
}

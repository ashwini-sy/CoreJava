package oopsConcepts;

public class ClassA {
	
	int Salary;
	String Name;
	String OrgName;
	public int Sal;
	
	public void Display() {
		System.out.println("Name of the Employee: "+Name);
		System.out.println("Salary of the Employee: "+Salary);
		System.out.println("Name of the Organization: "+OrgName);
	}
	
	public  int salary_deduction(int sal1,int sal2) {
		
		Sal=sal2-sal1;
		System.out.println("Total sal deduted :" + Sal);
		return Sal;
		
	}
	

}

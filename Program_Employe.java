package day5;
class Employee
{
	int id;
	String name;
	double basicsalary;
	double totalsalary;
	public Employee(int id,String name,double basicsalary)
	{
		this.id=id;
		this.name=name;
		this.basicsalary=basicsalary;
	}
	public void calculatesalary()
	{
		double HRA=(basicsalary/20)*100;
		double bonus=(basicsalary/10)*100;
		this.totalsalary=basicsalary+HRA+bonus;
		
	}
	public void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("basicsalary:"+basicsalary);
		System.out.println("totalsalary:"+totalsalary);	
	}
}

public class Program_Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"redha",30000);
		emp.calculatesalary();
		emp.display();
		
		

	}

}

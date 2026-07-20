package day5;
class Person
{
	String name;
	int age;
	public  Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
}
class Studen extends Person
{
	int marks;
	public Studen(String name,int age,int marks)
	{
		super(name,age);
		this.marks=marks;		
	}
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+ age);
		System.out.println("marks:"+ marks);

	}
		
}

public class Program_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studen student=new Studen("redha",4,100);
		student.display();

	}

}

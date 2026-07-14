package day2;

public class Program_Primenummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=97;
		boolean flag=false;
		if(num==1)
			System.out.println("neither prime or composite");
		else if(num==2)
			System.out.println("Prime");
		else if(num%2==0)
			System.out.println("not prime");
		else
			{
				for(int fact=3;fact<Math.sqrt(num);fact=fact+2)
				{
					if(num%fact==0)
					{
						flag=true;
						System.out.println("not  prime");
						break;
					}
						
				}
				if(flag==false)
					System.out.println("Prime");
			}
		}

	}



package day2;

public class Program_factorsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24;
		int i=1;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("factors of num:"+i);
			}
		}

	}

}

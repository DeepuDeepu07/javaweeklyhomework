package day3;

public class Program_commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 5, 7, 15, 20, 5};
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
			


	}

}

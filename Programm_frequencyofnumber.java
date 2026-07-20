package day3;
import java.util.*;

public class Programm_frequencyofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, 4, 6, 2, 2, 7};
		Arrays.sort(arr);
		int count=1;
		int i=0;
		for( i=0;i<arr.length;i++)
		{
			if(i<arr.length-1 && arr[i]==arr[i+1])
			{
				count++;
				
			}
			else 
			{
				System.out.println(arr[i]+"occurs"+count+"times");
				count=1;
			}
		}
		}

}

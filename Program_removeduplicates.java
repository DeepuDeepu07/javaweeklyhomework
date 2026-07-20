package day3;
import java.util.*;

public class Program_removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,5,2,3,9,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1 || arr[i]!=arr[i+1])
				System.out.print(arr[i]+" ");
		}
		
	}

}

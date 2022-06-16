package week1.Day2.Assignments;

import java.util.Arrays;

public class ArrMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int count =1;
		
		for (int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=i+count ) {
			System.out.println(i+count);
			count++;
			break;
		}

	}

	}	
}

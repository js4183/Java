package 배열;

import java.util.Random;

public class Ex배열별찍기 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(10)+1;
			System.out.print(arr[i]+" ");
			for(int j=1;j<=arr[i];j++) {
				System.out.print("*");
			}System.out.println();
		}
			
		

	}

}

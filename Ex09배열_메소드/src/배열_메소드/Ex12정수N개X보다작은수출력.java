package 배열_메소드;

import java.util.Scanner;

public class Ex12정수N개X보다작은수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("N 입력 >> ");
		int n = sc.nextInt();

		System.out.print("X 입력 >> ");
		int x = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"번째 정수 입력 >> ");			
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("결과 >> ");
		for(int i =0; i<arr.length;i++) {
			if(x>arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}

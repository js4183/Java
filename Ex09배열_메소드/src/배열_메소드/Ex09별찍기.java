package 배열_메소드;

import java.util.Scanner;

public class Ex09별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

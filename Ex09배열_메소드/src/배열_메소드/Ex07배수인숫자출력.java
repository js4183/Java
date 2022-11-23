package 배열_메소드;

import java.util.Scanner;

public class Ex07배수인숫자출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>>");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}

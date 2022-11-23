package 쪽지시험;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		sc.close();
		System.out.println("각 자리수 합 : " + sum);
		
	}

}

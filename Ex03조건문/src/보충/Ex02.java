package 보충;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력한 정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%d는(은) 짝수입니다.", num);
		} else {
			System.out.printf("%d는(은) 홀수입니다.", num);
		}
		sc.close();
	}

}

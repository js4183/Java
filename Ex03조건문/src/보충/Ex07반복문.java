package 보충;

import java.util.Scanner;

public class Ex07반복문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			System.out.print("숫자입력 : ");
			int input = sc.nextInt();
			sum += input;
			System.out.println("누적결과 : " + sum);
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		sc.close();

	}

}

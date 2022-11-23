package 보충;

import java.util.Scanner;

public class Ex06반복문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		while (input < 10) { //true 동작
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}

package while문;

import java.util.Scanner;

public class Ex01예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;

		while (num != -1) {
			sum += num;//누적 값
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("누적 결과 : " + sum);
		while(true) {
			sum += num;//누적 값
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num==-1) {
				break;
			}
		}
	}

}

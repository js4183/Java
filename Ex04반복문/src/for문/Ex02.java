package for문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		for (int i = 1; i <= num; i++) {
//			System.out.print(i + " ");
//		}
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		} else {//num1<num2
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
		//삼항연산자
		//int num3,4
		//큰 숫자 big, 작은 숫자 small
		//int big = (num3<num4)? num4:num3;
		//int small = (num3<num4)? num3:num4;
		
		//for(int i = small; i<=big; i++){
		//	System.out.println(i);
		//}
		

	}

}

package 조건문반복문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		System.out.print("반올림 수 : ");
		
		//방법1
		//1의자리수가 0~4 인지 5~9 인지 파악
		if(num%10>=0 && num%10<=4) {
			System.out.println(num/10*10);
		}else {
			System.out.println((num/10+1)*10);
		}
		
		//방법2
		//반올림 공식 사용
		System.out.println((num + 5)/10 * 10);
	}

}

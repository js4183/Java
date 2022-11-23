 package 조건문반복문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {  //입력한 수 만큼 줄 출력
			for(int j=1; j<=i; j++) { //각 줄 별의 개수 (줄 번호 만큼 별 개수 출력)
				System.out.print("*");
			}
			System.out.println(); //한 줄 출력 후 개행
		}
	}

}

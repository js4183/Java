package 다중if문;

import java.util.Scanner;

public class Ex02ifelse문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액 : ");
		int money = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String input = sc.next();
		//equals => true/false
		
		if(money>=1800&&input.equals("성인")) {
			System.out.println("감사합니다");
		}else if(money>=1500&&input.equals("청소년")) {
			System.out.println("반갑습니다");
		}else if(money>=1000&&input.equals("어린이")) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다");
		}

	}

}

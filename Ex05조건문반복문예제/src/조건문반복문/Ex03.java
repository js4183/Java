package 조건문반복문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("10000원 : "+ (money/10000));  
		System.out.println("5000원 : "+ (money%10000/5000));
		System.out.println("1000원 : "+ (money%5000/1000));
		System.out.println("500원 : "+ (money%1000/500));
		System.out.println("100원 : "+ (money%500/100));
		
	}

}

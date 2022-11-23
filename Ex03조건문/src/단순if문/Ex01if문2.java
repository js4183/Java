package 단순if문;

import java.util.Scanner;

public class Ex01if문2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 int n3 = num%3;
		 int n5 = num%5;
		 
		 if(n3==0||n5==0) {
			 System.out.println("3 또는 5의 배수 입니다.");
		 }
	}

}

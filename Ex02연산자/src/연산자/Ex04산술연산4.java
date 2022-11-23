package 연산자;

import java.util.Scanner;

public class Ex04산술연산4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = scan.nextInt();
		
		int box = ball%5==0? ball/5 : ball/5+1 ;
		
		System.out.println("필요한 상자의 수 : " + box);
	}

}

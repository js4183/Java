package 조건문반복문;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 
		//1 2 4 7 11
		//출력 되는 숫자가 +1 +2 +3 .. 순으로 증가된 숫자가 출력됨
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();

		int print = 1; //출력될 숫자
		for(int i=1; i<=num; i++) { //i 가 1~n 까지 증가(+1 +2 +3 ... 증가용으로 사용)
			System.out.print(print+" ");
			print+=i;  //출력될 숫자에 i를 누적하면서 +1 +2 +3 .. 순으로 증가하도록 함
		}
	}

}

package 조건문반복문;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int mul = 1; //누적곱 저장 변수 (곱이므로 초기값은 1!)
		
		for(int i =1; i<= input; i++) { //1부터 입력수 까지 1씩 증가
			mul*=i;  //mul 에 i를 누적 곱해줌
		}
		
		System.out.println("출력 : "+ mul);
		
	}

}

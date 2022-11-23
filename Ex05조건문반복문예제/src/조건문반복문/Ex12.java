package 조건문반복문;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("===채점하기===");
		String answer = sc.next();

		int sum = 0;  //총 점수 담을 변수
		
		int score = 1; //각 문제 점수 담을 변수
		
		for(int i=1; i<=answer.length(); i++) { //문자열의 ox 개수 만큼 반복
			
			
			if(answer.substring(i-1, i).equals("o")) { //o 일 경우
				sum+=score; //총점에 문제 점수 누적
				score++; //문제 점수 1증가
			}else {
				score = 1;  //문제 점수 초기화(1)
			}
			
		}
		System.out.print(sum);

	}

}

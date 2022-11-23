package 연산자;

import java.util.Scanner;

public class Ex03산술연산3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("JAVA 점수 입력 : ");//ex03
		int javaScore = scan.nextInt();

		System.out.print("WEB 점수 입력 : ");
		int webScore = scan.nextInt();

		System.out.print("ANDROID 점수 입력 : ");
		int andScore = scan.nextInt();

		int total = javaScore + webScore + andScore;

		double avg = total / (double) 3;// 3.0 실수형
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);

		// ex04 시분초 구하기
		System.out.print("초 입력 : ");
		int time = scan.nextInt();

		int hour = time / 3600; // 몫

		int min = time % 3600 / 60;

		int sec = time % 3600 % 60;// time%60

		System.out.printf("%d시 %d분 %d초", hour, min, sec);
		
		System.out.print("정수를 입력하세요 : "); //ex05
		int num = scan.nextInt();
		
		String result = (num%2==0)? "짝수" : "홀수" ;
		System.out.printf("%d는(은) %s입니다", num, result);
		
		System.out.println(num%2==1? num+"는(은) 홀수 입니다." : num+"는(은) 짝수입니다.");
	}

}

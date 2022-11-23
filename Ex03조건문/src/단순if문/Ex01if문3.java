package 단순if문;

import java.util.Scanner;

public class Ex01if문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int pyScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int andScore = sc.nextInt();
		
		int sum = javaScore+pyScore+andScore;
		double avg = sum/3.0;
		
		if(avg>80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}

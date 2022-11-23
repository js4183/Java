package 다중for문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 약수 구하기
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

//		for (int j = 2; j <= 30; j++) {
//			System.out.print(j + "의 약수 : ");
//			for (int i = 1; i <= j/2; i++) {
//				if (j % i == 0) {
//					System.out.print(i+" ");
//				}
//			}
//			System.out.println(j);
		// 완전수 구하기
		// int 누적
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			sum = 0;// j=1~1000 초기화
			// 약수 합 구하는 반복문
			for (int i = 1; i <= j / 2; i++) {
				if (j % i == 0) {
					sum += i;// 자기자신을 제외한 약수들의 합
				}
				if (j == sum) {
					System.out.println(j);
				}
			}
		}
	}
}

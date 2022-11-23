package 배열;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];// 1. 크기가 5인 배열 생성, 레퍼런스 변수 선언
		int maxScore;
		int minScore;
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {// 2. 입력한 값을 배열에 저장
			System.out.print((i + 1) + "번째 입력 >> ");
			arr[i] = sc.nextInt();
		}

		maxScore = arr[0];
		minScore = arr[0];

		System.out.print("입력된 점수 : ");
		for (int i = 0; i < arr.length; i++) {// 3. 배열안에 모든 값 출력
			System.out.print(arr[i] + " ");
			if (arr[i] > maxScore) {// 최고점수
				maxScore = arr[i];
			}
			if (arr[i] < minScore) {// 최저점수
				minScore = arr[i];
			}
			sum += arr[i];// 총합
			avg = (double) sum / arr.length;// 평균
		}
		System.out.println();
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최저 점수 : " + minScore);
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + avg);// ((float)sum/arr.length)

	}

}

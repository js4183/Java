package 배열;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// random 도구(객체, 인스턴스)
		Random rd = new Random();
		// rd.nextInt(20);
		// System.out.println(rd.nextInt(20)+1);

		int[] arr = new int[10]; // 배열생성 -> 값 따로 초기화 x (0)
		arr[0] = 5;//arr[0] = rd.nextInt(20)+1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 1;
		arr[5] = 4;
		arr[6] = 6;
		arr[7] = 3;
		arr[8] = 12;
		arr[9] = 10;

		// int[] arr2;
		// arr2 = {2,4,6,7,4,8,2,6,8,4};
		// 배열 생성 후 바로 변수까지 선언
		// int arr2[] = { 5, 6, 13, 27, 34, 35, 78, 2, 3, 1 };
		int arr3[] = { rd.nextInt(45) + 1, rd.nextInt(45) + 1, rd.nextInt(45) + 1, rd.nextInt(45) + 1,
				rd.nextInt(45) + 1, rd.nextInt(45) + 1, rd.nextInt(45) + 1, rd.nextInt(45) + 1, rd.nextInt(45) + 1,
				rd.nextInt(45) + 1 };

		int count = 0;
		System.out.print("배열 홀수 : ");
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = rd.nextInt(20)+1;
			if (arr3[i] % 2 == 1) {
				System.out.print(arr3[i]+" ");
				count++;
			}
		}System.out.println();
		System.out.println("홀수 개수 : " + count);
	}

}

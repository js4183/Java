package 배열;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		Random rd = new Random();
		//for 문 활용
		int[] arr = { rd.nextInt(20) + 1, rd.nextInt(20) + 1, rd.nextInt(20) + 1, rd.nextInt(20) + 1,
				rd.nextInt(20) + 1, rd.nextInt(20) + 1, rd.nextInt(20) + 1, rd.nextInt(20) + 1, rd.nextInt(20) + 1,
				rd.nextInt(20) + 1 };
		int max = 1;
		int min = 20;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
//		int[] arr2 = new int[10]
//		생성 중 문제를 일으킬 수 있으므로 항상 배열 먼저 생성 후
//		for(int j=0;j<arr2.length;j++) {
//			arr2[j] = rd.nextInt(20)+1;
//			System.out.print(arr2[j]+ " ");
//			if (arr2[j]>=max) {
//				max=arr2[j];
//			}
//			if (arr2[j]<=min) {
//				min=arr2[j];
//			}
//		}System.out.println();
//		System.out.println("큰 값 : "+ max);
//		System.out.println("작은 값 : "+min);
	}

}

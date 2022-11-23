package 버블정렬;

import java.util.Arrays;

public class 버블정렬_내림차순 {

	public static void main(String[] args) {

		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };

		System.out.println("정렬 전 : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			boolean sw = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp=arr[j+1];// arr[j+1] 변수에 저장
					arr[j+1]=arr[j];// arr[j+1]에 arr[j]값 저장
					arr[j] = temp;// //arr[j] temp(arr[j+1]) 저장
					sw = true;
				}
			}
			if (!sw) {
				break;
			}
			System.out.println(i + 1 + "회차 " + Arrays.toString(arr));
		}

	}

}

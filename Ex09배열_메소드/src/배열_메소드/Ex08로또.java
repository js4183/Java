package 배열_메소드;

import java.util.Random;

public class Ex08로또 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(45) + 1;
			for(int j = 0; j<i;j++) {// 중복 체크 for문
				if(arr[i]==arr[j]) {
					// 다시뽑게 -> i번째 숫자를 다시뽑는다!!
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("행운의 숫자 : " + arr[i]);
		}

	}

}

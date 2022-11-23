package 배열_메소드;

import java.util.Arrays;

public class Ex05성적별학생수출력 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arrScore = score.split(",");
		int a = 0, b = 0, c = 0, d = 0, f = 0;
		int[] cntArr = new int[5];
		// 정수형 배열은 따로 값을 설정하지 않으면 기본값 0
		// 0-A 1-B 2-C 3-D 4-F

		for (String s : arrScore) {
			if (s.equals("A")) {
				a++;
				cntArr[0]++;
			} else if (s.equals("B")) {
				b++;
				cntArr[1]++;
			} else if (s.equals("C")) {
				c++;
				cntArr[2]++;
			} else if (s.equals("D")) {
				d++;
				cntArr[3]++;
			} else if (s.equals("F")) {// else { f++; }
				f++;
				cntArr[4]++;
			}
		}
		System.out.printf("A: %d명\nB: %d명\nC: %d명\nD: %d명\nF: %d명", a, b, c, d, f);
		System.out.println(Arrays.toString(cntArr));
	}

}

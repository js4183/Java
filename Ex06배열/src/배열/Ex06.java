package 배열;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ans = { 1, 4, 3, 2, 1 };
		int[] input = new int[5];
		int score = 0;
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + "번답 >> ");
			input[i] = sc.nextInt();
		}
		sc.close();
//		System.out.printf("입력한 답은 : %d %d %d %d %d \n",res[0],res[1],res[2],res[3],res[4]);
		System.out.println("정답 확인");
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == input[i]) {
				System.out.print("O" + " ");
				score += 20;
			} else {
				System.out.print("X" + " ");
			}
		}
		System.out.print(" 총 점 : " + score);

	}

}

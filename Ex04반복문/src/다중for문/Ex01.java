package 다중for문;

public class Ex01 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i);
//		}
		// 반복문 중첩
		
		for (int j = 1; j <= 9; j++) {//
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

}

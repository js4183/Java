package 다중for문;

public class Ex02 {

	public static void main(String[] args) {
		// 피라미드 별찍기
		for (int j = 1 ;j<=5;j++) { // 1-2-3-4-5
			for (int i = 1; i <=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (int j = 1; j <= 5; j++) { // 5-4-3-2-1
//			for (int i = 5; j <= i; i--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int j = 1; j <= 5; j++) { // 우측 정렬 1-2-3-4-5
//			for (int i = 4; j <= i; i--) {//4번 반복~0번반복
//				System.out.print(" ");
//			}
//			for (int i = 1; i <= j; i++) {//1번반복~5번반복
//				System.out.print("*");
//			}
//			System.out.println();

	}
}

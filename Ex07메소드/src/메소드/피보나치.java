package 메소드;

public class 피보나치 {

	public static void main(String[] args) {

		fiboPrint(7);
//		for (int i = 1; i <= 8; i++) {// i번째 항까지 출력
//			System.out.print(fibo(i) + " ");// n번째 항 출력
//		}
	}

	// 피보나치 수열에 특정 항의 값을 구하는 메서드
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}

	}

	public static void fiboPrint(int n) {
		for (int i = 1; i <= n; i++) {
			if (i <= 1) {
				System.out.print(i+" ");
			} else {
				System.out.print(fibo(i - 2) + fibo(i - 1)+" ");
			}
		}
	}

}

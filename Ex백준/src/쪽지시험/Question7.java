package 쪽지시험;

public class Question7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int b = 4; i <= b; b--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

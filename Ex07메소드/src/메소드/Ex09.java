package 메소드;

public class Ex09 {

	public static void main(String[] args) {
		// Method overloading -> 메소드 중복정의
		System.out.println(sum(2, 3));
		System.out.println(sum(2, 3, 4));

	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

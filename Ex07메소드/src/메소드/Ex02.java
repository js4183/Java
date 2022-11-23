package 메소드;

public class Ex02 {

	public static void main(String[] args) {
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
//		print();
//		print2();
//		print3(14,7);
	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void sub(int num1, int num2) {
		// 큰 수 에서 작은 수를 뺄수 있도록 수정!
//		if (num1 > num2) {
//			System.out.println(num1 - num2);
//		} else {
//			System.out.println(num2 - num1);
//		}
		int result = num1 >num2? num1-num2 : num2-num1;
		System.out.println(result);
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}

//	public static void print() {
//		System.out.println(5 * 7);
//	}
//
//	public static String print2() {
//		String print2 = "5월 7일";
//		System.out.println(print2);
//		return print2;
//	}
//
//	public static int print3(int num1, int num2) {
//		int result = num1 / num2;
//		System.out.println(result);
//		return result;
//	}
}

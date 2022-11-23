package 메소드;

public class Ex07 {

	public static void main(String[] args) {
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
	}

	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(num);
		System.out.println();// 개행
	}

}

package 배열_메소드;

public class Ex13base의n제곱 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result *=  base;
		}
		return result;
	}
}

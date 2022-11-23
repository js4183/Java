package 메소드;

public class Ex05 {

	public static void main(String[] args) {
		int num1 = 13;
		int num2 = 2;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
//		int num3 =11;
//		int num4 =5;
//		int make = close9(num3, num4); 자동으로 int
//		sum(); void
		
	}

	public static int close10(int num1, int num2) {
//		int ans = 0;
//		int a = 10-num1;// num1과 10의 차이값
//		int b = 10-num2;// num2와 10의 차이값
//		
//		//거리의 차가 음수가 나오지 않도록 절대값 작업 진행
//		if(a < 0) {
//			a *= -1;
//		}if(b < 0) {
//			b *= -1;
//		}
		
		int a = Math.abs(10-num1);
		int b = Math.abs(10-num2);
		
		//10과의 거리가 어느수가 더 가까운지 판단하기!
		if(a > b) {
			return num2;
		}else if(a < b) {
			return num1;
		}else {
			return 0;
		}
		
//		if (num1 >= 10) {
//			a = num1 - 10;
//		} else {
//			a = 10 - num1;
//		}
//		if (num2 >= 10) {
//			b = num2 - 10;
//		} else {
//			b = 10 - num2;
//		}
//		if (a < b) {
//			ans = num1;
//		} else if (b < a) {
//			ans = num2;
//		} else if (a == b) {
//			ans = 0;
//		}
	}

}

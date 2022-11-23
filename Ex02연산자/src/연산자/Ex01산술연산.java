package 연산자;

public class Ex01산술연산 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;

		System.out.println(num1 / num2); // 정수, 정수 ->1
		System.out.println(num3 / num4); // 실수, 실수 ->1.4285715
		System.out.println(num3 / num2); // 실수, 정수 ->1.4285715

//		String a = 10 + 7 + ""; -> "107" 문자열
//		String b = 8 + "" + 2; -> "82" 문자열
//		String c = "" + 5 + 2; -> "5"+2 = "52" 문자열
		
		int num5 = 7;
		int num6 = 3;
		
		System.out.println(num5+num6);
		System.out.println(num5-num6);
		System.out.println(num5*num6);
		System.out.println(num5/(double)num6);
		
		int sum = num5+num6; // 합
		int minus = num5-num6; // 차
		int mul = num5*num6;//곱
		double div = (double)num5/num6;//나누기
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);
		System.out.printf("나누기 결과 : %.2f",div);
	}

}

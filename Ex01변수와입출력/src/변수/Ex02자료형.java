package 변수;

public class Ex02자료형 {

	public static void main(String[] args) {
		//1.primitive type 기본타입 : 자바 언어에 내장된 기본 유형
		//1-1. 논리형(yes/no, true/false, on/off)
		boolean sw = true;
		boolean sw1 = false;
		
		//1-2. 문자형 (문자 하나만 표현)
		char c = '나';//문자형 '' 작은따옴표
		char c1 = 97;//아스키코드 a의미함
		char c2 = '\uAC00';//유니코드
		
		//1-3. 정수형(byte, short, int, long)//자동 형변환 해줌
		int num = 3; //정수의 기본형
		short num3 = 1;
		long num2 = 4;
		
		//1-4. 실수형(float, double)//강제 형변환 해야함
		double d = 10.123;
		float f = (float)10.123;//강제 형변환 방법1
		float f1 = 10.123f;//강제 형변환 방법2
		
		//2. reference type : 값 저장, 기능이 정의가 되어있음
		//2-1. 문자열형 String
		String s;
		s = "Hello World!";
		
		//출력문 -> 콘솔창 (ctrl + f11 : 실행)
		System.out.print(s.substring(0,5));//(0,5) 첫번째 0, 5-1까지
//		System.out.println(s+"!!!!!"); //문자열 + 연산기호 사용가능
//		System.out.println(s+123);//문자열 + 숫자 -> 문자열
		//System.out.printf("출력서식", 출력내용); "\S,\d,\s",name, age, major
	}

}

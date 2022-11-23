package 변수;

//인코딩 설정 EUC-KR 완성형(강), UTF-8 조합형(ㄱㅏㅇ)

public class Ex01변수선언 {

	public static void main(String[] args) {
		// 변수 : 데이터를 담을 수 있는 공간(값 변경 가능)
		// 변수 선언(자료형 변수이름;)
		// 자료형 : 변수에 담을 자료의 형태(정수형, 실수형, 문자형, 논리형)
		// 변수이름 : 예약어 사용 불가능 int class;
		int num;
		num = 3;

		int num3 = 3;// alt+shift+r : 변수 일괄 변경
		num3 = 5; // 새로운 값을 할당
		// ctrl+alt+방향키(위,아래) : 코드 복사
		num3 = 5; // 새로운 값을 할당
		// ctrl+shift+f : 코드 정렬
		num3 = 7;
		// alt + 방향키(위,아래) : 코드 순서 바꾸기(위, 아래)

		// 상수 선언 : 값 변경 불가능, final 키워드 사용
		final int num5 = 10; // num5 = 12;
		long a = 25;
		float b = (float)1.5;
		char c ='A';
		boolean d = true;
	}

}

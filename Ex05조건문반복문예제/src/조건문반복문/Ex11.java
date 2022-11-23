package 조건문반복문;

public class Ex11 {

	public static void main(String[] args) {
		
		String str = "01001101";

		int num = 0;  //숫자 하나하나를 담을 변수
		int sum = 0;  //2진수 연산 결과 누적 담을 변수
		
		for(int i=1; i<=str.length(); i++) { //문자열의 숫자 개수 만큼 반복
			//1의 자리 부터 숫자 하나하나 구하기위해 문자열 자름
			//숫자연산을 해야하므로 자른 문자열은 정수형으로 변환
			//레퍼런스 자료형 -> 기본자료형 이므로 기능 사용해야함 
			num = Integer.parseInt(str.substring(str.length()-i,str.length()-i+1));
			
			if(num==1) { //숫자가 1일 경우에만
				for(int j=1; j<i; j++) { 
					num*=2; //1의자리 -> 0번 2의자리 -> 1번 ... 씩 2가 곱해지도록 반복문 작성
				}
			}
			sum+=num; //구한 각 자리 수 sum 에 누적 합
		}
		
		System.out.printf("%s(2) = %d(10)",str,sum);
	}

}

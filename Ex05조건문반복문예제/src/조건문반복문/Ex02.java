package 조건문반복문;

public class Ex02 {

	public static void main(String[] args) {
		
		int sum = 0; //합계 저장 변수
		
		for(int i=1; i<=100; i++) { //i가 1~100까지 수 가짐
			if(i%2==1) {//i가 홀수인 경우
				System.out.print(i+" "); //숫자 그대로 출력
				sum+=i; //sum변수에 누적합
			}else {
				System.out.print(-i+" "); //숫자 앞에 -기호 붙여서 출력
				sum-=i; //sum변수에 누적차
			}
		}
		System.out.println();
		System.out.println("결과 : "+sum);
	}

}

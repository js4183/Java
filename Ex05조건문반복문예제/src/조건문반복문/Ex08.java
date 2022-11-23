package 조건문반복문;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;  //합계 저장 변수
		
		while(num>0) {//모든 수를 다 더하고 하면 num/=10 의 결과가 0이 나오게 됨/ 그 전까지만 반복
			sum+= num%10; //1의자리 수만 계속 누적합
			num/=10; //이미 더해진 1의자리 수는 제외하기 위해 10으로 나누었을 때 몫만 다시 num에 저장
		}
		System.out.println(sum);
	}

}

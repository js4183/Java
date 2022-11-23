package 조건문반복문;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		int sum = 0; //대시 수 합계 저장 변수
		
		while(num>0) {//모든 대시 수를 다 더하고 하면 num/=10 의 결과가 0이 나오게 됨/ 그 전까지만 반복
			//1의자리 수 대시 수 구하여 sum에 누적
			if(num%10==0) {
				sum += 6;
			}else if(num%10==1) {
				sum += 2;
			}else if(num%10==2) {
				sum += 5;
			}else if(num%10==3) {
				sum += 5;
			}else if(num%10==4) {
				sum += 4;
			}else if(num%10==5) {
				sum += 5;
			}else if(num%10==6) {
				sum += 6;
			}else if(num%10==7) {
				sum += 3;
			}else if(num%10==8) {
				sum += 7;
			}else if(num%10==9) {
				sum += 6;
			}
			num/=10; //이미 더해진 1의자리 수는 제외하기 위해 10으로 나누었을 때 몫만 다시 num에 저장
		}
		System.out.println(sum);

	}

}

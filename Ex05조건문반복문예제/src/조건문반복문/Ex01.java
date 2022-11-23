package 조건문반복문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int wh = sc.nextInt();
		int pay = 0; //총 임금
		
		if(wh>=8) {
			//8시간은 무조건 5000원
			//일한 시간이 8시간이 넘으면 8시간에 대해서는 무조건 5000이기 때문에 40000 원에서
			//초과 근무 시간에 대한 임금만 연산하여 더해줌!
			//1.5 (실수)가 연산되기 때문에 결과값이 실수가 되지 않도록(돈은 실수로 표현하지 않음)
			//정수형으로 형변환 (double->int) 이기 때문에 강제 형변환!
			pay = 40000 + (int)(5000*1.5*(wh-8));
		}else {
			pay = wh * 5000;
		}
		System.out.println("총 임금은 "+pay+"원 입니다.");
	}

}

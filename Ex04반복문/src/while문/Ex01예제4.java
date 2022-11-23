package while문;

import java.util.Scanner;

public class Ex01예제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int cur = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int week = 0;
		int weight = 0;

		while (cur > goal) {
			System.out.printf("%d주차 감량 몸무게 : ", ++week);
			weight = sc.nextInt();
			cur = cur - weight;// cur -= weight;
			//while(true) if( cur <= goal ) { break; } 
		}
		System.out.println("최종 몸무게 : " + cur);
		System.out.println("축하합니다!!!");
	}

}

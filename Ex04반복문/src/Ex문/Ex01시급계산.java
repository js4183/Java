package Ex문;

import java.util.Scanner;

public class Ex01시급계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int bonus = 0;
		int money = 0;

		if (hour <= 8) {
			money = 5000 * hour;
		} else {
			money = 5000*8+(int)((5000*1.5) * (hour - 8));
		}System.out.println("총 임금은 "+money+"원 입니다.");
		//

	}

}

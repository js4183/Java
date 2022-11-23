package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex06랜덤 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int o = 0;//맞춘갯수
		int x = 0;//틀린갯수
		int input = 0;
		int num1 = rd.nextInt(10) + 1;// (10) -> 0~9 추출
		int num2 = rd.nextInt(10) + 1;

		do {
			System.out.printf("%d + %d = ", num1, num2);
			input = sc.nextInt();
			if ((num1 + num2) == input) { //정답
				num1=rd.nextInt(10)+1;
				num2=rd.nextInt(10)+1;
				System.out.println("Success!");
				o++;
			} else { //오답
				System.out.println("Fail!");
				x++;
			}
				System.out.print("계속하시겠습니까? ");
				String answer = sc.next();
				
			if (answer.equals("N") || answer.equals("n")) {
				System.out.println("종료!");
				System.out.println("맞춘개수 : " + o);
				System.out.println("틀린개수 : " + x);
				break;
			}else if(answer.equals("Y") || answer.equals("y")) {
				continue; // 현재 줄 아래에 있는 실행문장은 무시 조건 확인 부분으로 바로 이동
			}
		}while (true);
	}

}


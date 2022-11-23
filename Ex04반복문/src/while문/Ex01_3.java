package while문;

import java.util.Scanner;

public class Ex01_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(true) { //무한반복
			num = sc.nextInt();
			if(num>=10) { //반복을 멈출 조건
				break;
			}
		}
	}

}

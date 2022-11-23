package Ex문;

import java.util.Scanner;

public class Ex08정수의합출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
		
		
		
		System.out.printf("합은 %d입니다.", sum);
		}
}

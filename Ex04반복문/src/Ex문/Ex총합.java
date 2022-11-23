package Ex문;

import java.util.Scanner;

public class Ex총합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum +=i;
			}
		} else {//num1<num2
			for (int i = num1; i <= num2; i++) {
				sum +=i;
			}
		}
		sc.close();
		System.out.println(sum);

	}

}

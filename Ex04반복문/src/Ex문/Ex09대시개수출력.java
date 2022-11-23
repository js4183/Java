package Ex문;

import java.util.Scanner;

public class Ex09대시개수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String input = sc.next();

		int sum = 0;
		for (int i = 1; i <= input.length(); i++) {
			sum = 0;
			if (input.substring(i - 1, i).equals("0")||input.substring(i - 1, i).equals("6")
					|| input.substring(i - 1, i).equals("9")) {
				sum += 6;
			} else if (input.substring(i - 1, i).equals("1")) {
				sum += 2;
			} else if (input.substring(i - 1, i).equals("2") || input.substring(i - 1, i).equals("3")
					|| input.substring(i - 1, i).equals("5")) {
				sum += 5;
			} else if (input.substring(i - 1, i).equals("4")) {
				sum += 4;
			} else if (input.substring(i - 1, i).equals("7")) {
				sum += 3;
			} else if (input.substring(i - 1, i).equals("8")) {
				sum += 7;
			}sum += sum;
		}

	}

}

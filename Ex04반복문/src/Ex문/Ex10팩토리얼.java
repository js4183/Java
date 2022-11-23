package Ex문;

import java.util.Scanner;

public class Ex10팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		int out = 1;
		
		for(int i=1;i<=input;i++) {
			out *=i;
		}System.out.println("출력 : "+out);

	}

}

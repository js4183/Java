package Ex00;

import java.util.Scanner;

public class Ex두수비교하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int A = sc.nextInt();
		System.out.print("");
		int B = sc.nextInt();
		
		if (A>B) {
			System.out.println(">");
		}else if(A==B) {
			System.out.println("==");
		}else {
			System.out.println("<");
		}
	}

}

package Ex00;

import java.util.Scanner;

public class Ex구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= 3;
		int b = 100;
		
		for( int i = a;a>=0;a--) {
			System.out.println("시리얼 먹는다.");
		}
		for( int j = b;b>=0;b-=10) {
			System.out.println("우유를 먹는다.");
		}

	}

}

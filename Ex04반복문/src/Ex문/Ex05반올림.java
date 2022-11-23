package Ex문;

import java.util.Scanner;

public class Ex05반올림 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int answer = 0;
		int m = num%10;
		int n = num/10;
		
		if(m>=5) {
			answer = (n+1)*10;
		}else {
			answer = n*10;
		}System.out.println("반올림 수 : "+answer);

	}

}

package 보충;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		int num = 0;
		if(input%10>=5) {
			num = (input/10 +1)*10;
		}else {
			num = (input/10)*10;
		}
		sc.close();
		System.out.println("반올림 수 : "+num);

	}

}

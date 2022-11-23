package Ex문;

import java.util.Scanner;

public class Ex112진수입력10진수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int c = 0;
		int d = 0;
		for (int i = 1; i <= str.length(); i++) {
			c = 1;
			if (str.substring(i - 1, i).equals("1")) {// 1인 경우
				for (int j = 1; j <= str.length()-i; j++) {
					c *= 2;
				}
				d +=c;
				
			} else {// 0인 경우
			}
		}
		System.out.println(str + "(2) = " + d + "(10)");
		//charAt() -> 결과값 char
		//subString() -> 결과값 String
		//String s = str.subString((str.length()-i,str.length()-i+1))
		//Integer : int의 클래스타입(레퍼런스타입)
		//Integer.parseInt(s); 문자열->정수 // 문자 있으면 X
		//int n = Integer.parseInt(s);
		//if(n==1) {
		//	for(int j=1;j<i;j++){
		//		n*=2;
		//	}
		//}
		//sum+= n;
		
		
	}
}
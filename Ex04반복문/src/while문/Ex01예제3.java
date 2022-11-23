package while문;

import java.util.Scanner;

public class Ex01예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		int odd = 0;//홀수
		int even = 0;//짝수
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num%2==1) {
				odd+=1;
			}else if(num%2==0){
				even++;
			}
		}while(num!=-1);
		System.out.println("홀수 개수 : "+odd);
		System.out.println("짝수 개수 : "+even);
		
//		while(num !=-1) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num%2==0) {
//				even++;
//			}else if(num%2==1){
//				++odd;
//			}
//		}System.out.println("홀수 개수 : "+odd);
//		 System.out.println("짝수 개수 : "+even);

	}

}

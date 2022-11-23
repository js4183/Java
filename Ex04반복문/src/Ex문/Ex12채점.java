package Ex문;

import java.util.Scanner;

public class Ex12채점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int score = 0;
		System.out.println("==== 채점하기 ====");
		String ox = sc.next();
		for(int i = 1; i<=ox.length(); i++) {
			if(ox.substring(i-1,i).equals("o")) {
				score +=1;
			}else if(ox.substring(i-1,i).equals("x")) {
				score =0;
			}
			sum+=score;
		}
		System.out.println(sum);
	}

}

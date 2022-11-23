package Ex문;

public class Ex369게임 {

	public static void main(String[] args) {
		int a = 10;
		for(int i=1;i<=50;i++) {
			if(i%a==5) {
				System.out.println("으악");
			}else if(i%a==3||i%a==6||i%a==9) {
				System.out.println("박수");
			}
			else {
			System.out.println(i);
			}
		}

	}

}

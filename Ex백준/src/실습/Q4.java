package 실습;

public class Q4 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				sum+=i;
			}else {
				System.out.print(-i+" ");
				sum-=i;
			}
		}
	
		System.out.println("\n결과 : "+ sum);
	}

}

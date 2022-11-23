package Ex문;

public class Ex반복문복습 {

	public static void main(String[] args) {
//		int down = 77;
//		int up = 1;
//		int sum = 0;
//		for (int i = 1; i <= 77; i++) {
//			sum += (down*up);
//			down--;
//			up++;
//		}
//		System.out.println(sum);
		
		int j = 77;
		int sum = 0;
		for (int i=1; i <= 77; i++, j--) {
			sum += (i * j);
		}
		System.out.println(sum);

	}

}

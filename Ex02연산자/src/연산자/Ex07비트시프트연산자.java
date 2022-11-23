package 연산자;

public class Ex07비트시프트연산자 {

	public static void main(String[] args) {
		// 비트연산 : AND(&), OR(|). XOR(^). NOT(~)
		System.out.println(3&5); //둘다 1일때 1
		System.out.println(3|5); //둘다 0일때 0
		System.out.println(3^5); //다르면 1, 같으면 0
		System.out.println(~3); //0->1, 1->0 맨앞이 1일경우에는 음수
		
		//시프트연산 (<<, >>)
		int a = 3;
		int b = a<<2;
		System.out.println(b);
	}

}

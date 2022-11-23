package while문;

import java.util.Scanner;

public class Ex01예제5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int chance = 3;
		
		String id = "";
		String pw = null;
		

		while (chance != 0) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			pw = sc.nextLine();
			if (id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				chance--;
				if (chance == 0) {
					System.out.println("본인인증을 해주세요");
				}
			}
			System.out.print("계속 하시겠습니까?");
			String a = sc.nextLine();
			if (a.equals("N")) {
				break;
			}
			if (chance == 0) {
				System.out.println("본인인증을 해주세요");
			}
		}
	}

}

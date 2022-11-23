package 보충;

import java.util.Scanner;

public class Ex05switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("선풍기 풍속을 조절합니다.");
//		System.out.println("1번 : 약, 2번 : 중, 3번 : 강");
//		System.out.print("선택한 번호 : ");
//		int fan = sc.nextInt();
//		switch (fan) {
//		case 1:
//			System.out.println("약한 바람이 나옵니다.");
//			break;
//		case 2:
//			System.out.println("중간 바람이 나옵니다.");
//			break;
//		case 3:
//			System.out.println("강한 바람이 나옵니다.");
//			break;
//		default:
//			break;
//		}
//		sc.close();
		System.out.print("몇월인가요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 2, 12:
			System.out.println("겨울");
			break;
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		default:
			break;
		}
		sc.close();
	}

}

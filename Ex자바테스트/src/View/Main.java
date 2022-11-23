package View;

import java.util.Scanner;

import Controller.StoreController;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StoreController sc = new StoreController();

		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int menu = scan.nextInt();
			if (menu == 1) {// 음식
				sc.getRe();
			} else if (menu == 2) { // 미용실

			} else if (menu == 3) { // 상세보기
				System.out.print("가게명 입력 : ");
				sc.getgra(scan.next());

			} else if (menu == 4) { // 평점보기
				sc.total();

			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}

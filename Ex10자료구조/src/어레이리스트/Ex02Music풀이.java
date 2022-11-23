package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Music풀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();

		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				printList(musicList);
				System.out.print("[1]마지막 위치 추가 [2]원하는 위치에 추가 >> ");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String musicName = sc.nextLine();
					musicList.add(musicName);
					// musicList.add(sc.next());
				} else {
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String musicName = sc.nextLine();
					System.out.print("추가할 위치 입력 : ");
					int index = sc.nextInt();
					musicList.add(index - 1, musicName);// arraylist 0~
				}
				System.out.println("추가가 완료되었습니다!");
			} else if (menu == 2) {
				boolean listEmpty = printList(musicList);
				
				if (!listEmpty) {// 비어있으면 true이므로 ->비어있않으면 삭제기능
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.print("삭제할 노래 선택 : ");
						int deleteMusic = sc.nextInt();
						musicList.remove(deleteMusic - 1);
					} else {
						musicList.clear();
					}
					System.out.println("삭제가 완료되었습니다!");
				}

			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	// musicList 출력 메서드

	public static boolean printList(ArrayList<String> al) {
		//
		boolean isEmptyList = false;

		// 현재 재생목록 출력
		System.out.println("===Music List===");
		if (al.size() == 0) {// 재생목록이 비어있을경우
			// isEmpty()->값이 없으면, 비어 있으면 true, 값이 있으면false
			System.out.println("재생목록이 없습니다.");
			isEmptyList = true;
		} else {
			int n = 1;
			for (String s : al) {
				System.out.println(n++ + ". " + s);
				// n++;
			}
		}
		System.out.println("=================");
		return isEmptyList;
	}

}

package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
		int num = 0;

		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("========== 현재 재생 목록 ==========");
				if (musiclist.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					int n = 1;
					for (String ml : musiclist) {
						System.out.println(n + ". " + ml);
						n++;
					}
				}
				System.out.println("=================================");
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int mp = sc.nextInt();
				if (mp == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String mn = sc.next();
					System.out.println("추가가 완료되었습니다.");
					musiclist.add(mn);
				} else if (mp == 2) {
					System.out.print("추가할 노래 입력 : ");
					String mn = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int mi = sc.nextInt();
					System.out.println("추가가 완료되었습니다.");
					musiclist.add(mi, mn);
				}
			} else if (num == 2) {
				int n = 1;
				for (String ml : musiclist) {	
					System.out.println(n++ +". "+ml);
				}
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				int rc = sc.nextInt();
				if (rc == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					int ri = sc.nextInt();
					System.out.println("노래가 삭제되었습니다.");
					musiclist.remove(ri-1);
				} else if (rc == 2) {
					musiclist.clear();
					System.out.println("전체list가 삭제되었습니다.");
				}
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

}

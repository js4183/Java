package 배열;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id = new String[3];
		String[] pw = new String[3];

		int cnt = 0;// 현재 몇명이 가입했는지 저정할 변수

		while (true) {
			System.out.println("1. 회원가입 2.로그인 3.종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (cnt < 3) {
					System.out.println("===회원가입===");
					System.out.print("id 입력 : ");
					id[cnt] = sc.next();
					System.out.print("pw 입력 : ");
					pw[cnt] = sc.next();
					System.out.println("가입 성공");
					cnt++;
				} else {
					System.out.println("더이상 가입할 수 없습니다.");
				}

			} else if (sel == 2) {
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				String inputPw = sc.next();
				
				boolean sw = false;// 로그인 성공/실패 저장할 변수
				for (int i = 0; i < cnt; i++) {
					if (inputId.equals(id[i]) && inputPw.equals(pw[i])) {
						System.out.println("로그인 성공");
						sw = true;
						break;
					}
				}
				if(sw==false) {
					System.out.println("로그인 실패!");
				}
			} else if (sel == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}

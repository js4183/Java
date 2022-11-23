package 스위치;

import java.util.Scanner;

public class Ex03자판기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1. 콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		int menu = sc.nextInt();
		int change = 0;

		switch (menu) {
		case 1:
			change = money-1800;
			break;
		case 2:
			change = money-2000;
			break;
		case 3:
			change = money-1200;
			break;
		default:
			System.out.println("메뉴를 다시 선택하세요.");
		}
		if (change>=0) {
			System.out.println("잔돈 : " + change + "원");
			System.out.println("천원 : " + (change/1000));
			System.out.println("오백원 : " + ((change%1000)/500));
			System.out.println("백원 : " + ((change%500)/100));
		} else{
			System.out.println("돈이 부족해요ㅠㅡㅜ");
		}
	}

}

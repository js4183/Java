package com.smhrd.controller;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class GameController implements GameInterface {

	@Override
	public void printMenu() {
		System.out.print("[1]내 캐릭터 생성 [2]전투모드 [3]내 캐릭터 확인 [4]종료");

	}

	// 내 캐릭터 생성
	@Override
	public Charac myCharac(int select) {
		// 1번 선택 -> 라이언 객체 생성
		// 2번 선택 -> 춘식 객체 생성
		// 생성된 캐릭터 반환
		Charac myC = null;// 라이언/춘식 생성된 객체 담을 용도

		if (select == 1) {
			// 라이언 객체 생성
			myC = new Ryan();
		} else if (select == 2) {
			// 춘식이 객체 생성
			myC = new Chunsik();
		}
		// 생성된 캐릭터의 아스키아트 출력
		myC.printASCII();
		// 생성된 객체 반환
		return myC;
	}

	@Override
	public Charac oppCharac(Charac myCharac) {
		// 내캐릭터 어떤 타입인지
		// myCharac가 원래 라이언 타입 이었니?
		// 원래 라이언 -> true
		// 원래 라이언 타입 x -> false
		Charac oppC = null;

		if (myCharac instanceof Ryan) {
			// 춘식 생성
			oppC = new Chunsik();
			System.out.println("야생의 춘식이가 나왔습니다!");
		} else if (myCharac instanceof Chunsik) {
			// 라이언 생성
			oppC = new Ryan();
			System.out.println("야생의 라이언이 나왔습니다!");
		}
		return oppC;
	}

	// 한번의 공격 - 방어
	// 한캐릭터라도 죽은 경우에는 -> false
	// 계속 전투를 할 수 있는 경우(아무도 죽지않은경우)에는 -> true
	
	
	@Override
	public boolean battle(Charac myC, Charac oppC, int ad) {
		boolean cont =true;
		// 1. 사용자가 1 -> 공격
		// 내캐릭터는 상대방 공격, 상대방은 방어
		if (ad == 1) {
			myC.attack(oppC);
			oppC.defence();

		}

		// 2. 사용자 2-> 방어
		// 상대방은 내캐릭터를 공격, 내캐릭터는 방어
		else if (ad == 2) {
			myC.defence();
			oppC.attack(myC);
		}
		// 내캐릭터의 체력(hp)와 상대방캐릭터의 체력(hp)을 출력
		System.out.println("내 캐릭터 체력 : " + myC.getHp());
		System.out.println("상대방 캐릭터 체력 : " + oppC.getHp());

		// 1. 내캐릭터가 죽었는지(myC HP <= 0)
		// 내캐릭터의 경험치 -10감소
		// 전투 종료
		if (myC.getHp() <= 0) {
			if(myC.getXp()>=10) {
				myC.setXp(myC.getXp()-10);
			}else {
				myC.setXp(0);
			}
			System.out.println(myC.getType()+"이 죽었습니다.");
			cont = false;
		}

		// 2. 상대방캐릭터가 죽었는지(oppC HP<=0)
		// 내캐릭터의 경험치 +10 증가
		else if (oppC.getHp()<=0) {
			myC.setXp(myC.getXp()+10);
			System.out.println(oppC.getType()+"을 죽었습니다.");
			cont = false;
			// 만약에 경험치를 10 증가시킨후 내 경험치가 30이상이 되면
			// -> 레벨 1증가
			if (myC.getXp()>=30) {
				myC.levelUp();
				System.out.println("레벨업!!");
			}
		}
		
		// 캐릭터중 하나라도 죽은 캐릭터가 있으면 false 반환
		// 죽은 캐릭터가 없으면 true반환
		return cont;
	}

	@Override
	public void checkMyC(Charac myC) {
		// 타입, 레벨, 경험치, 체력, 공격력, 방어력 출력
		System.out.println("내 캐릭터 타입 : " + myC.getType());
		System.out.println("내 캐릭터 레벨 : " + myC.getLevel());
		System.out.println("내 캐릭터 HP : " + myC.getHp());
		System.out.println("내 캐릭터 XP : " + myC.getXp());
		System.out.println("내 캐릭터 공격력 : " + myC.getAtk());
		System.out.println("내 캐릭터 방어력 : " + myC.getDef());
	}

}

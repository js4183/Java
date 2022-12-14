package Ex02;

public class PiggyBank {
	// 저금통의 기능을 가질 수 있는 설계도 만들기
	
	// 1. 필드 -> 금액을 관리할 수 있는 money
	int money, income, expend;
	
	// 2. 메소드 -> 리턴 타입이 없는 형태로 기본구조만 생성하기 
	// static 키워드 사용X static(정적) 같은 공간에서 사용
	// - 돈을 넣을 수 있는 기능 deposit()
	public void deposit(int money) {
		//this ->클래스(설계도)가 자체적으로 가지고 있는 변수를 가르키는 키워드
		this.money += money;
	}
	// - 돈을 인출할 수 있는 기능 withdraw()
	public void withdraw(int money) {
		this.money -= money;
	}
	// - 잔액을 확인할 수 있는 기능 showMoney()
	public void showMoney() {
		System.out.println("현재 잔액 : "+ money);
	}
}

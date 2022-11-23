package Ex02;

public class piggyMain {

	public static void main(String[] args) {
		// 설계도에 의한 piggy 객체 생성
		PiggyBank piggy = new PiggyBank();

		// piggy 객체의 money속성에 1500원 적금하기
		piggy.deposit(1500);
		// piggy 객체의 money속성에 700원 적금하기
		piggy.deposit(700);

		piggy.withdraw(500);

		// 현재 까지의 입금액 학인하기
		piggy.showMoney();

		PiggyBank piggy2 = new PiggyBank();
		piggy2.deposit(1000);
		
		System.out.println();
		System.out.print("piggy 금액 : ");
		piggy.showMoney();
		System.out.print("piggy2 금액 : ");
		piggy2.showMoney();
	}
}

package Ex02;

public class CharacMain {

	public static void main(String[] args) {
		
		// 추상적으로 만들어진 클래스는
		// 미완성되어 있는 클래스로 명확하게 객체 생성을 할 수 없다!
		// -> 추상 클래스는 new 키워드를 사용할 수 없다!(미완성)
		
//		Charac cha = new Charac();
		
//		cha.run();
//		cha.jump();
//		cha.attack();
		
		System.out.println();
		
		Wizard ch2 = new Wizard();
		ch2.run();
		ch2.jump();
		ch2.attack();
		
		System.out.println();
		
		Warrior ch3 = new Warrior();
		ch3.run();
		ch3.jump();
		ch3.attack();

	}

}

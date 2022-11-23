package Ex02;

public class BurgerMain {

	public static void main(String[] args) {
		
		Burger burger = new Burger();
		
		CheeseBurger cheese = new CheeseBurger();
		
		burger.make();
		cheese.cheesemake();
		
		System.out.println("---업캐스팅---");
		Burger b1= new CheeseBurger();
		b1.make();
		
		System.out.println();
		cheese.make();
		cheese.cheesemake();
	}

}

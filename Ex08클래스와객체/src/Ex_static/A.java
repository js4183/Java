package Ex_static;

public class A {

	public static void main(String[] args) {

		test01();

		A a = new A();// 객체화
		a.test02();

		B.test03();// b.test03()
		B b = new B();// 객체화
		b.test04();// static x -> heap
		
	}

	public static void test01() {
		System.out.println("static이 있는 test01 메소드");
	}

	public void test02() {
		System.out.println("static이 없는 test02 메소드");
	}

}

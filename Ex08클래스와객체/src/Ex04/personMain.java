package Ex04;

public class personMain {

	public static void main(String[] args) {
		// 1. Person의 default 생성자를 사용하여 객체 생성
		Person person1 = new Person();
		
		// 2. person1에 이름과 나이 초기화
		person1.setName("채수민");
		person1.setAge(27);
		
		// 3. 2개의 매개변수를 넘겨받아 새로운 객체 생성
		Person person2 = new Person("강예진", 20);
		
		// 4. 출력
		System.out.println("Person1의 이름 : "+person1.getName()+", 나이 : "+person1.getAge());
		System.out.println("Person2의 이름 : "+person2.getName()+", 나이 : "+person2.getAge());
	}

}

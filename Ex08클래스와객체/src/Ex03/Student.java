package Ex03;

public class Student {
	// 학생정보를 관리하기 위한 설계도
	String name;// 이름
	String number;// 학번
	int age;// 나이
	int scoreJava;// 자바 점수
	int scoreWeb;// 웹 점수
	int scoreAndroid;// 안드로이드 점수

	// 기본 생성자 메소드
	public Student() {
		
	}
	
	// 생성자 메소드 오버로딩(중복정의)
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
		
	}
	
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Andorid점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("=================================================");

//		System.out.printf(
//				"%s님 안녕하세요.\n[ %s, %d살 ]\n%s님의 Java점수는 %d점 입니다.\n%s님의 Web점수는 %d점 입니다.\n%s님의 Android점수는 %d점 입니다.\n=======================",
//				name, number, age, name, scoreJava, name, scoreWeb, name, scoreAndroid);
	}

}

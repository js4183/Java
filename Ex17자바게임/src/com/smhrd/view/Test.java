package com.smhrd.view;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class Test {

	public static void main(String[] args) {

		Chunsik cs = new Chunsik();
		cs.printASCII();

		Ryan r = new Ryan();
		r.printASCII();

		// 추상클래스로는 절대 객체 생성 불가능 -> 컴파일오류
		// new Charac("a", 20, 20);
	}

}

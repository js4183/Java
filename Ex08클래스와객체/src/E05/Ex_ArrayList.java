package E05;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// 배열 리스트 선언하기
		// <> -> 제네릭타입 : 클래스 구조(레퍼런스)로 되어있는 데이터 타입을 지정
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list.size());
		
		list.add(1);// 추가시 가장 마지막 위치에 데이터 추가
		System.out.println(list.size());
		
		list.add(3);
		System.out.println(list.size());
		
		//데이터 확인하기 (가져오기) ->get(위치)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		list.add(7);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 데이터 삭제 -> remove(위치)
		list.remove(1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// 데이터 수정 -> set(수정할 데이터 위치, 수정할 데이터 값)
		list.set(0, 9);
		System.out.println(list.get(0));
		
	}

}

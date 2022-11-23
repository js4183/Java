package 스택;

import java.util.Stack;

public class Ex01stack생성 {

	public static void main(String[] args) {

		// 1. 스택생성
		Stack<String> st = new Stack<>();// 크기지정x
		
		//<>:primitive Type -> Reference Type
		//정수형
		// (저장)char -> Character(기능 있음)
		// int -> Integer
		// "123" => 123 (String -> int)
		// Integer.parseInt("123");
		Stack<Integer> st1 = new Stack<>();

		// 2. 요소 삽입
		st.push("apple");
		st.push("banana");
		st.push("kiwi");
		st.push("peach");
		
		// 3. 가장 위(top)에 있는 데이터 확인
		String s = st.peek();
		System.out.println(s);
		
		// 4. 가장 위(top)에 이쓴 데이터 꺼내기(삭제)
		String s1 = st.pop();
		System.out.println(s1);
		
		System.out.println(st.peek());
		
		// 5. 요소 조회 (search) 위에서 부터 1번
		// 특정 데이터가 몇번째에 존재하는지 -> 정수형으로 반환
		int n = st.search("banana");
		System.out.println(n);
		
		// 6. 스택이 비어있는지 확인(empty)
		System.out.println(st.empty());//비어o:true, 비어x:false
		
		//스택이 빌때까지 요를 꺼내기
		while(!st.empty()) {// 스택이 비어있지 않으면
			//요소를 꺼내기
			System.out.println(st.pop());
		}
		
	}

}

package 스택;

public class Node {
	// 데이터
	private int data;
	// 다음 노드의 주소
	private Node nextNode;

	public Node(int n) {
		data = n;
		nextNode = null;// 다음 노드 주소는 아직 모름
	}

	// 노드의 데이터를 가지고 오기
	public int getData() {
		return data;
	}

	// 해당 노드와 연결되어 있는 노드의 주소(참조값) 가져오기
	public Node getNextNode() {
		return nextNode;
	}

	// 현재 생성된 노드가 이전에 top노드의 주소값을 가지고 있도록 (연결)
	public void linkNode(Node top) {// top : 현재 탑노드의 주소(참조값)
		nextNode = top;
	}
}

package 큐;

public class QueueNode {
	// 데이터
	private int data;
	// 다음 노드의 주소
	private QueueNode Node;

	public QueueNode(int n) {
		data = n;
		Node = null;// 다음 노드 주소는 아직 모름
	}
	// 노드의 데이터를 가지고 오기
	public int getData() {
		return data;
	}
	// 해당 노드와 연결되어 있는 노드의 주소(참조값) 가져오기
	public QueueNode getnextAddress() {
		return Node;
	}
	// 현재 생성된 노드가 이전에 노드의 주소값을 가지고 있도록 (연결)
	public void LinkNode(QueueNode next) {// 현재 노드의 주소(참조값)
		Node = next;
	}
}

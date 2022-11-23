package 트리;

public class Tree {
	private Node rootNode;// 근노드(root) 주소(참조값) 저장

	// 생성자
	public Tree() {
		rootNode = null;
	}
	
	//루트노드 구하는 메서드
	public Node getRootNode() {
		return rootNode;
	}

	// 이진탐색트리구성 메서드
	// 근노드값을 기준으로 새로운 값이 작으면 왼쪽, 크면 오른쪽
	public void addNode(int n) {
		if (rootNode == null) {// 루트가 비어있는 경우, 아무 노드도 없는 경우
			rootNode = new Node(n);
		} else {
			Node root = rootNode; // 최상위루트부터 시작~그다음 비교해줘야하는 노드 참조값 저장(각 트리의 근노드)
			Node currentNode;// 포인터

			while (true) {
				currentNode = root;

				// 새로운 노드의 값이 비교하는(current)노드 값보다 작으면 -> 왼쪽
				if (n < root.getData()) {
					root = root.getLeftNode();//

					// 왼쪽 자식노드가 비어있는 경우 -> 바로 새로운 노드 삽입
					if (root == null) {
						currentNode.setLeftNode(new Node(n));
						break;// 삽입끝 -> 반복문 종료
					}
				} else {// 새로운 노드의 값이 비교하는(current) 노드 값보다 큼 -> 오른쪽
					root = root.getRightNode();

					// 오른쪽 자식노드가 비어있는 경우 -> 바로 새로운 노드 삽입
					if (root == null) {
						currentNode.setRightNode(new Node(n));
						break;// 삽입끝 -> 반복문 종료
					}
				}
			}
		}
	}

	public void print() { // 재귀함수 : 메서드내에서 자기자신을 다시 호출
		System.out.println("출력!");
		print();
	}

	// 전위순회(root-left-right)
	public void preOrderTree(Node root) {
		// 1. 근노드 확인 - 근노드 data 출력
		// 2. 왼쪽노드주소 확인(채워져있는지 / null)
		// 3-1 if 왼쪽 노드 주소가 null -> 더이상 왼쪽은 안봐도됨
		// 3-2 if 왼쪽 노드 주소가 null이 아님
		// 왼쪽노드 data 출력
		// 왼쪽노드 주소확인(채워져있는지 / null)
		if (root != null) {
			System.out.print(root.getData()+" ");// 1
			preOrderTree(root.getLeftNode());
			preOrderTree(root.getRightNode());
		}
//		if(root.getLeftNode()==null) {// 왼쪽노드 주소 확인
//			//null
//		}else {
//			root.getLeftNode().getData();// 출력
//			if~
//			else
//				if
//		}
	}
	// 중위순회(left-root-right)
	public void inOrderTree(Node root) {
		if(root!=null) {
			inOrderTree(root.getLeftNode());
			System.out.print(root.getData()+" ");
			inOrderTree(root.getRightNode());
		}
	}
	
	// 후위순회(left-right-root)
	public void postOrderTree(Node root) {
		if(root!=null) {
			postOrderTree(root.getLeftNode());
			postOrderTree(root.getRightNode());
			System.out.print(root.getData()+" ");
		}
	}
}

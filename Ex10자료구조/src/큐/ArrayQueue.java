package 큐;

public class ArrayQueue {
	private int[] que;
	private int capacity;// 큐 용량
	private int front, rear;

	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다.");
		}
	}

	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			System.out.println("큐가 가득 차있습니다!");
		}
	}

	public ArrayQueue(int max) {
		que = new int[max];
		front = rear = 0;// 초기값 0 front 앞쪽에서 remove 할때 참조하는 index, rear 뒤쪽으로 add 할때 인덱스
	}

	public int add(int n) {
		if (isFull()) {// 가득 차있을경우
			throw new OverflowQueueException();// 예외처리
		} else {// 그렇지 않을 경우
			return que[rear++] = n;// 인덱스 0부터 순차적으로 배열에 할당
		}
	}

	public int remove() {
		if (isEmpty()) {// 비어 있을경우
			throw new EmptyQueueException();// 예외처리
		} else {
			return que[front++];// 배열 인덱스 0부터 순차적으로 remove
		}

	}

	public int peek() {
		if (isEmpty()) {// 비어 있을경우
			throw new EmptyQueueException();// 예외처리
		} else {
			return que[front];// 맨 앞에 있는 값 출력
		}

	}

	// 큐가 비었는지
	// 비어있으면 true 비어있지않으면 false
	public boolean isEmpty() {
		return rear == front;
	}

	// 큐가 가득차있는지
	// 가득차있으면 true 차있지않으면 false
	public boolean isFull() {
		return rear >= capacity;
	}
}

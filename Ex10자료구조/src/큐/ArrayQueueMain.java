package 큐;

public class ArrayQueueMain {

	public static void main(String[] args) {
		
		ArrayQr aq = new ArrayQr(5);
		
		aq.enque(1);
		aq.enque(2);
		aq.enque(3);
		aq.enque(4);
		aq.enque(5);
		
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		
		System.out.println(aq.peek());
	}

}

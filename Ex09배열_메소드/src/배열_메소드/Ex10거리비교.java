package 배열_메소드;

public class Ex10거리비교 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 거리가 가장 짧은 인덱스 번호 저장
		int index1 = 0, index2 = 0;
		// 현재까지 제일 짧은 거리 저장
		int len = point[0];

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {// i+1~6
				if (Math.abs(point[i] - point[j]) < len) {
					len = Math.abs(point[i] - point[j]);
					index1 = i;
					index2 = j;
				}

			}
		}
		System.out.println("result = ["+index1+", "+index2+"]");
	}

}

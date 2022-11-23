package 이차원배열;

public class Ex02 {

	public static void main(String[] args) {
//		int[][] arr = new int[4][6];
//		int num =21;
//		for(int i=0;i<arr.length;i++) {// 1-2-3-..
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=num++;
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		int[][] arr2 = new int[5][5];
//		int num = 1;
//		for (int i = 0; i < arr2.length; i++) {// 5-4-3-..
//			for (int j = 4; j >= 0; j--) {
//				arr2[i][j] = num++;
//			}
//		for (int j=0;j<arr2.length;j++) {
//			arr2[i][arr2[i].length-1-j] = num++;
//		}
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + "\t");
//			}
//			System.out.println();
//		}
		int[][] arr3 = new int[5][5];// 지그재그 출력
		int num = 1;
		for (int i = 0; i < arr3.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr3[i].length; j++) {
					arr3[i][j] = num++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr3[i][j] = num++;
				}
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

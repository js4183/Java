package 배열_메소드;

public class Ex04가운데글자구하기 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));

	}

	public static String getMiddle(String string) {
		int length = string.length();
		int index = length / 2;
		return (length % 2 == 0) ? string.substring(index - 1, index + 1) : string.substring(index, index + 1);
	}

}

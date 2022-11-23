package Ex문;

import java.util.Scanner;

public class Ex13알파벳빈도 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String input = sc.next();

		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0,
				p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

		for (int cnt = 0; cnt < input.length(); cnt++) {
			if (input.charAt(cnt) == 'a' || input.charAt(cnt) == 'A') {
				a++;
			} else if (input.charAt(cnt) == 'b' || input.charAt(cnt) == 'B') {
				b++;
			} else if (input.charAt(cnt) == 'c' || input.charAt(cnt) == 'C') {
				c++;
			} else if (input.charAt(cnt) == 'd' || input.charAt(cnt) == 'D') {
				d++;
			} else if (input.charAt(cnt) == 'e' || input.charAt(cnt) == 'E') {
				e++;
			} else if (input.charAt(cnt) == 'f' || input.charAt(cnt) == 'F') {
				f++;
			} else if (input.charAt(cnt) == 'g' || input.charAt(cnt) == 'G') {
				g++;
			} else if (input.charAt(cnt) == 'h' || input.charAt(cnt) == 'H') {
				h++;
			} else if (input.charAt(cnt) == 'i' || input.charAt(cnt) == 'I') {
				i++;
			} else if (input.charAt(cnt) == 'j' || input.charAt(cnt) == 'J') {
				j++;
			} else if (input.charAt(cnt) == 'k' || input.charAt(cnt) == 'K') {
				k++;
			} else if (input.charAt(cnt) == 'l' || input.charAt(cnt) == 'L') {
				l++;
			} else if (input.charAt(cnt) == 'm' || input.charAt(cnt) == 'M') {
				m++;
			} else if (input.charAt(cnt) == 'n' || input.charAt(cnt) == 'N') {
				n++;
			} else if (input.charAt(cnt) == 'o' || input.charAt(cnt) == 'O') {
				o++;
			} else if (input.charAt(cnt) == 'p' || input.charAt(cnt) == 'P') {
				p++;
			} else if (input.charAt(cnt) == 'q' || input.charAt(cnt) == 'Q') {
				q++;
			} else if (input.charAt(cnt) == 'r' || input.charAt(cnt) == 'R') {
				r++;
			} else if (input.charAt(cnt) == 's' || input.charAt(cnt) == 'S') {
				s++;
			} else if (input.charAt(cnt) == 't' || input.charAt(cnt) == 'T') {
				t++;
			} else if (input.charAt(cnt) == 'u' || input.charAt(cnt) == 'U') {
				u++;
			} else if (input.charAt(cnt) == 'v' || input.charAt(cnt) == 'V') {
				v++;
			} else if (input.charAt(cnt) == 'w' || input.charAt(cnt) == 'W') {
				w++;
			} else if (input.charAt(cnt) == 'x' || input.charAt(cnt) == 'X') {
				x++;
			} else if (input.charAt(cnt) == 'y' || input.charAt(cnt) == 'Y') {
				y++;
			} else if (input.charAt(cnt) == 'z' || input.charAt(cnt) == 'Z') {
				z++;
			}
		}
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("k : " + k);
		System.out.println("l : " + l);
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("o : " + o);
		System.out.println("p : " + p);
		System.out.println("q : " + q);
		System.out.println("r : " + r);
		System.out.println("s : " + s);
		System.out.println("t : " + t);
		System.out.println("u : " + u);
		System.out.println("v : " + v);
		System.out.println("w : " + w);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);

	}

}

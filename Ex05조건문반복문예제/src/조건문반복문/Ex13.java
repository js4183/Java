package 조건문반복문;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		String input = sc.nextLine();
		
		
		//방법1. 모든 알파벳 별로 카운트할 변수 선언 후 출력
		//코드가 길지만 단순하고 연산도 단순함
		
		//-> 후에 배울 배열을 활용하면 이 코드도 단순해질수 있음!
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z =0;
		
		for(int cnt=0; cnt<input.length(); cnt++) {
			if(input.charAt(cnt)=='a'||input.charAt(cnt)=='A') {
				a++;
			}else if(input.charAt(cnt)=='b'||input.charAt(cnt)=='B') {
				b++;
			}else if(input.charAt(cnt)=='c'||input.charAt(cnt)=='C') {
				c++;
			}else if(input.charAt(cnt)=='d'||input.charAt(cnt)=='D') {
				d++;
			}else if(input.charAt(cnt)=='e'||input.charAt(cnt)=='E') {
				e++;
			}else if(input.charAt(cnt)=='f'||input.charAt(cnt)=='F') {
				f++;
			}else if(input.charAt(cnt)=='g'||input.charAt(cnt)=='G') {
				g++;
			}else if(input.charAt(cnt)=='h'||input.charAt(cnt)=='H') {
				h++;
			}else if(input.charAt(cnt)=='i'||input.charAt(cnt)=='I') {
				i++;
			}else if(input.charAt(cnt)=='j'||input.charAt(cnt)=='J') {
				j++;
			}else if(input.charAt(cnt)=='k'||input.charAt(cnt)=='K') {
				k++;
			}else if(input.charAt(cnt)=='l'||input.charAt(cnt)=='L') {
				l++;
			}else if(input.charAt(cnt)=='m'||input.charAt(cnt)=='M') {
				m++;
			}else if(input.charAt(cnt)=='n'||input.charAt(cnt)=='N') {
				n++;
			}else if(input.charAt(cnt)=='o'||input.charAt(cnt)=='O') {
				o++;
			}else if(input.charAt(cnt)=='p'||input.charAt(cnt)=='P') {
				p++;
			}else if(input.charAt(cnt)=='q'||input.charAt(cnt)=='Q') {
				q++;
			}else if(input.charAt(cnt)=='r'||input.charAt(cnt)=='R') {
				r++;
			}else if(input.charAt(cnt)=='s'||input.charAt(cnt)=='S') {
				s++;
			}else if(input.charAt(cnt)=='t'||input.charAt(cnt)=='T') {
				t++;
			}else if(input.charAt(cnt)=='u'||input.charAt(cnt)=='U') {
				u++;
			}else if(input.charAt(cnt)=='v'||input.charAt(cnt)=='V') {
				v++;
			}else if(input.charAt(cnt)=='w'||input.charAt(cnt)=='W') {
				w++;
			}else if(input.charAt(cnt)=='x'||input.charAt(cnt)=='X') {
				x++;
			}else if(input.charAt(cnt)=='y'||input.charAt(cnt)=='Y') {
				y++;
			}else if(input.charAt(cnt)=='z'||input.charAt(cnt)=='Z') {
				z++;
			}
		}
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			System.out.println("c : "+ c);
			System.out.println("d : "+ d);
			System.out.println("e : "+ e);
			System.out.println("f : "+ f);
			System.out.println("g : "+ g);
			System.out.println("h : "+ h);
			System.out.println("i : "+ i);
			System.out.println("j : "+ j);
			System.out.println("k : "+ k);
			System.out.println("l : "+ l);
			System.out.println("m : "+ m);
			System.out.println("n : "+ n);
			System.out.println("o : "+ o);
			System.out.println("p : "+ p);
			System.out.println("q : "+ q);
			System.out.println("r : "+ r);
			System.out.println("s : "+ s);
			System.out.println("t : "+ t);
			System.out.println("u : "+ u);
			System.out.println("v : "+ v);
			System.out.println("w : "+ w);
			System.out.println("x : "+ x);
			System.out.println("y : "+ y);
			System.out.println("z : "+ z);
			
			
			//방법2 . 알파벳별로 몇개씩 있는지 확인 후 문자열로 생성하고 출력하는 방법 
			//-> 코드는 단순해 보이지만 연산이 많아짐
			//char -> 아스키코드 (A -> 65 Z -> 90 , a -> 97 z -> 122)
		
			//각 알파벳의 개수를 문자열로 저장할 변수
			//cntStr = "20011000100020000111000000"
			String cntStr = "";
			
			for(int alpha = 65; alpha<=90; alpha++) { //a 부터 차근차근 보기위한 바깥쪽 for문
				int alphaCnt = 0; //각 알파벳 별 개수를 저장할 변수, 한 알파벳 개수 센 후에는 0으로 다시 초기화
				for(int cnt=0; cnt<input.length(); cnt++) { //문장 전체를 보면서 한 알파벳이 몇개 있는지 보기위한 안쪽 for문
					if(input.charAt(cnt)==alpha+32 ||input.charAt(cnt)==alpha) { //각 인덱스 별 해당 알파벳이 있다면 alphaCnt 1증가
						alphaCnt++;
					}
				}
				cntStr += alphaCnt; //문자열에 누적 -> cntStr이 String 이므로 숫자 연산이 아닌 문자열 더하기 수행!
			}
			
			System.out.println(cntStr);
			
			for(int cnt = 0; cnt<cntStr.length(); cnt++) { //문자열 첫번째 문자부터 출력
				System.out.println((char)(cnt+97)+" : "+ cntStr.charAt(cnt));
			}
			
		
	}

}

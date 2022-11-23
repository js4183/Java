package Q1_2;

public class Tv {
	String color;
	int channel;
	
	
	public int channel(int num) {
		return num;
	}
	
	public String color(String color) {
		return color;
	}
	
	public void channelUp() {
		channel +=1;
	}
	
	public void channelDown() {
		channel -=1;
	}
	
	public void print() {
		System.out.println("Tv의 현재 채널은 : "+channel+"이고, "+"Tv의 색깔은 "+color+" 입니다.");
	}
}

import java.util.Scanner;

public class RadioUse {

	public static void main(String[] args) {
		Radio r;
		r = new Radio();
		r.channel = 7;
		r.channelDown();
		System.out.println("현재 채널은 " + r.channel + " 입니다.");
		System.out.println(r.power);
		r.power();
		System.out.println("라디오 온 했습니다");
		
	}
}

class Radio {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}


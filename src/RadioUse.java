import java.util.Scanner;

public class RadioUse {

	public static void main(String[] args) {
		Radio r;
		r = new Radio();
		r.channel = 7;
		r.channelDown();
		System.out.println("���� ä���� " + r.channel + " �Դϴ�.");
		System.out.println(r.power);
		r.power();
		System.out.println("���� �� �߽��ϴ�");
		
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


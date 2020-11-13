public class Exam011_MyWallet {

	public static void main(String[] args) {
		MyWallet ann = new MyWallet();
		
//		ann.wallet = 100000;  Error
		System.out.println("Name : " + ann.name);
		System.out.println("Age : " + ann.age);
		System.out.println("Address : " + ann.address);
//		System.out.println("Wallet : " + ann.wallet);  Error
		ann.show_mywallet();
		ann.pay_wallet(10000);
		ann.show_mywallet();	
	}
}


class MyWallet {
	// iv 선언부
	String name;
	int age;
	String address;
	private int wallet;
	
	// 생성자 선언
	public MyWallet() {
		this("김근호", 25, "서울 송파구", 100000);
		}
	
	public MyWallet(String name, int age, String address, int wallet) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.wallet = wallet;
	}
	
	void show_mywallet() {
		System.out.println("Mywallet : " + wallet);
	}
	void pay_wallet(int pay)
	{
		wallet = (wallet - pay);
	}
}

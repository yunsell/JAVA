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
	// iv �����
	String name;
	int age;
	String address;
	private int wallet;
	
	// ������ ����
	public MyWallet() {
		this("���ȣ", 25, "���� ���ı�", 100000);
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

class Product{
	static int count=0;
	int serialNo;

	{	// �ν��Ͻ� �ʱ�ȭ �ҷ� : ��� �����ڿ��� ���������� ����
		++count;
		serialNo=count;
	}

	public Product() {} // ����Ʈ ������
}


public class Exam012_class_count_intance_num {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ" + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ" + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ" + p3.serialNo);	
		
	}
}

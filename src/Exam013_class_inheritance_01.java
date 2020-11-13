class Point {
	int x;
	int y;
	
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

// ��Ӱ���
class Circle extends Point{
	int r;
	
	Circle () {} // default ������
	Circle (int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
}

// ���԰���
//class Circle {
//	Point p = new Point();
//	int r;
//}

public class Exam013_class_inheritance_01 {

	public static void main(String[] args) {
		
		Circle c = new Circle(20,20,100);
		
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);
		
	}
}

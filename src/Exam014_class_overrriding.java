class Point1{
	int x;
	int y;
	
//	String getLocation() {
//		return "x :" + x + ", y :" + y;
//	}
	
	public String toString() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z:" + z;
	}
}
public class Exam014_class_overrriding {

	public static void main(String[] args) {
		
		Point1 p = new Point1();
		Point3D p3 = new Point3D();
		p.x = 100;
		p.y	= 100;	
		
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		
		System.out.println(p3.getLocation());
//		System.out.println(p.toString());
		System.out.println(p);
	}
}

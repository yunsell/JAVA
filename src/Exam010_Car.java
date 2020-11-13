class Car{
   String color;
   String gearType;
   int door;

   Car(){
      
   }

   Car(String color, String gearType, int door){
      this.color = color;
      this.gearType = gearType;
      this.door = door;

   }
}


public class Exam010_Car {
   public static void main(String[] args) {

      Car c1 = new Car();
      c1.color   ="white";
      c1.gearType="auto";
      c1.door = 4;

      Car c2 = new Car("white", "auto",4);
      System.out.println("c1ÀÇ color="+c1.color+",gearType="+ c1.gearType+ ",door="+c1.color);
      System.out.println("c2ÀÇ color="+c2.color+",gearType="+ c2.gearType+ ",door="+c2.color);

   }
}
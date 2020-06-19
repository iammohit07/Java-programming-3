package circle;
import java.util.Scanner;
public class Circle {
      private double radius=1;
    private String color="red";
     Circle(){

     }
     Circle(double radius){
         this.radius=radius;
     }
     void getRadius(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the radius of the circle: ");
         radius=sc.nextDouble();
     }
     void getArea(){
         double area= 3.14* radius*radius;
         System.out.println("The area of the circle is "+ area);
     }
    public static void main(String[]args){
      Circle area= new Circle();
      area.getRadius();
      area.getArea();

    }
}
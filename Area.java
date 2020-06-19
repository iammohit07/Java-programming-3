package area;
import java.util.Scanner;

public class Area {
    double l,b, area;

    Area(){

    }
    Area(double l, double b){
        this.l=l;
        this.b=b;
    }

    void setDim(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        l=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle:");
        b=sc.nextDouble();
    }
    void getArea(){
        area= l*b;
        System.out.println("The area of the rectangle is "+ area);
    }
    public static void main(String[] args) {
        Area areanew= new Area();
        areanew.setDim();
        areanew.getArea();
    }
}
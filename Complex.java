package complex;
  
import java.util.Scanner;
class complex1{
    Scanner sc=new Scanner(System.in);
    double real1,real2,sum1,sum2,sum3,diff1,diff2,prod1,prod2;
    int img1,img2,i;
    
    public void getNumber()
    {
        System.out.println("Enter the first number: ");
        System.out.println("Enter the real number: ");
        real1=sc.nextInt();
        System.out.println("Enter Imaginary number: ");
        img1=sc.nextInt();
        System.out.println("Enter  second numbers: ");
        System.out.println("Enter  real number: ");
        real2=sc.nextInt();
        System.out.println("Enter  Imaginary number:");
        img2=sc.nextInt();
        
        
        
        
    }
    public void sum()
    {
        sum1=real1+real2;
        sum2=img1+img2;
        
        System.out.println("Sum of the numbers is: "+sum1+"+" +sum2+"i");
        
        
        
    }
    public void diff(){
        diff1=real2-real1;
        diff2=img2-img1;
        System.out.println("Difference of  the numbers is:"+diff1+"+" +diff2+"i");
}
     public void mul(){
        prod1=(real2*real1)-(img1*img2);
        prod2=(real1*img2)+(real2*img1);
        System.out.println("Product of the numbers is:"+prod1+"+" +prod2+"i");
     }
}
public class Complex
{
    public static void main(String[] args)
    {
        complex1 c1=new complex1();
        c1.getNumber();
        c1.sum();
        c1.diff();
        c1.mul();
    }
}
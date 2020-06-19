
package sum;
import java.util.Scanner;

public class Sum {
    int sum=0;
    int sum(int n){
        sum=n%10;
        if(n==0){
            return 0;
        }
        else{
            return sum + sum(n/10);
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        Sum x= new Sum();
        int a=x.sum(n);
        System.out.println("The result is: "+ a);
    }
}
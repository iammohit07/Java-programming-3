
package pattern1;
import java.util.Scanner;
public class Pattern1 {
    int x;
    void pattern(int n){
        if(n<-x){
            return;
        }
        else{
            System.out.print(" "+ Math.abs(n));
            pattern(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Pattern1 p=new Pattern1();
        p.x=n;
        p.pattern(n);
    }
}
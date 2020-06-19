package sequence;
import java.util.Scanner;

public class Sequence {
    int num;


    void printSequence(int n) {
        if (n < -num) {

            System.out.print("");
        }
        else {
            System.out.print(" " + Math.abs(n));
            printSequence(n - 1);

        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int n= sc.nextInt();
        Sequence s=new Sequence();
        s.num=n;
        s.printSequence(n);


    }
}

import java.util.Scanner;

public class TwoFibonic {
    public static int Fib(int a,int b,int n){
        if (n>0){
            System.out.println(a);
            return Fib(b,a+b,n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter how many number of fibonic series do you want:");
        int n=sn.nextInt();
        Fib(0,1,n);
    }
}

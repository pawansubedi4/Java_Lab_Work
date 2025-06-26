
import java.util.Scanner;

public class Power {
    static int Pow(int a,int n){
        if (n==1){
            return a;
        }
        else{
            return a*Pow(a, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number and power respectively:");
        int n=sn.nextInt();
        int p=sn.nextInt();
        System.out.println("The answer is "+Pow(n,p));
    }
}

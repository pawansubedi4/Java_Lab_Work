
import java.util.Scanner;

public class Prime_Not {
    // public int d=2;
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void Prime(int n,int d){
        int c=(int) Math.sqrt(n);
        if (d==c){
            System.out.println("it is prime number");
            return;
        }
        else if(n%d==0){
            System.out.println("it is composit");
            return;
        }
        else{
            Prime(n,d+1);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sn.nextInt();
        Prime(n,2);
    }
}

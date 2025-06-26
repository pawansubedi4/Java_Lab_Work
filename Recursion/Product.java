
import java.util.Scanner;

public class Product {
    static int product(int a,int b){
        if (a==1){
            return b;
        }
        else {
            return b+product(a-1,b);
        }

    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter any two number:");
        int a=sn.nextInt();
        int b=sn.nextInt();
        if (a<b){
            System.out.println("the product is "+product(a,b));
        }
        else{
            System.out.println("the product is "+product(b,a));
        }
    }
}

import java.util.Scanner;
public class Sum_of_natural {
    static int fact (int n){
        if (n==1){
            return 1;
        }
        else {
            return n+fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sn.nextInt();
        System.out.println("the sum is "+fact(n));
    }
}

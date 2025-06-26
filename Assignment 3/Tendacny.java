
import java.util.Scanner;

public class Tendacny {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter any three number:");
        int a=sn.nextInt();
        int b=sn.nextInt();
        int c=sn.nextInt();
        int sm=(a<b)?((a<c)?a:b):((b<c)?b:c);
        System.out.println("the smallest is "+sm);
    }
}

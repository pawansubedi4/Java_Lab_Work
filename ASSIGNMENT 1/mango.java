
import java.util.Scanner;
class mango {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter price of 1 dozen of mango");
        int p12=s.nextInt();
        System.out.println("enter how many mango do you want:");
        int Q=s.nextInt();
        System.out.println("your total amount is "+(p12/12*Q));
    }
}

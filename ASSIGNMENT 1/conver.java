
import java.util.Scanner;

public class conver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1.convert feet into inch");
        System.out.println("2.convert kg into pound");
        System.out.println("enter your choice (1 to 2):");
        int c=s.nextInt();
        switch (c){
            case 1 -> {
                System.out.println("enter feet:");
                int feet=s.nextInt();
                System.out.println("the result in inch is"+(feet*12));
            }
            case 2 -> {
                System.out.println("enter kg:");
                int kg=s.nextInt();
                System.out.println("the result in pound is"+(kg*2.20));
            }
        }
    }    
}

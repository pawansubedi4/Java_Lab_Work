
import java.util.Scanner;

public class Areaf {
    public static void main(String[] srgs){
        Scanner sn= new  Scanner(System.in);
            System.out.println("1. Area of Triangle.\n2. Area of Rectangle.\n3. Area of Circle");
            System.out.println("Enter option in range (1-3)");
            int op=sn.nextInt();
            switch(op){
                case 1->{
                    System.out.println("enter base:");
                    int b=sn.nextInt();
                    System.out.println("enter height:");
                    int h=sn.nextInt();
                    float c=b*h*1/2f;
                    System.out.println("The result is "+c);
                }
                case 2->{
                    System.out.println("enter length:");
                    int l=sn.nextInt();
                    System.out.println("enter breadth:");
                    int b=sn.nextInt();
                    System.out.println("The result is "+(l*b));
                }
                case 3->{
                    System.out.println("enter radius:");
                    int r=sn.nextInt();
                    float c=3.1416f*r*r;
                    System.out.println("The result is "+c);
                }
                default->
                System.out.println("Not in option.");
            }
    }
}

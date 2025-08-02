import java.util.Scanner;
public class meanu {
    static void try123(){
        Scanner sn=new Scanner(System.in);
        System.out.println("1. Feet to Inch\r\n2. Inch to Feet\r\n3. KG to Pounds\r\n4. Pounds to KG\r\n5. NPR to USD\r\n6. USD to NPR\r\n7. Exit");
        System.out.println("enter (1 to 7)");
        int choice=sn.nextInt();
        switch(choice){
        case 1:{
            System.out.println("enter feet:");
            double ft=sn.nextDouble();
            System.out.println("The result is "+ft*12);
            try123();
        }
        case 2:{
            System.out.println("enter inch:");
            int inc=sn.nextInt();
            System.out.println("the result is "+inc/12);
            try123();
        }
        case 3:{
            System.out.println("enter kg:");
            int kg=sn.nextInt();
            System.out.println("the result is "+kg*2.20);
            try123();
        }
        case 4:{
            System.out.println("enter pound:");
            int po=sn.nextInt();
            System.out.println("the result is "+po/2.20);
            try123();
        }
        case 5:{
            System.out.println("enter npr");
            int nrp=sn.nextInt();
            System.out.println("the result is "+nrp/138);
            try123();
        }
        case 6:{
            System.out.println("enter usd");
            int usd=sn.nextInt();
            System.out.println("the result is "+usd*138);
            try123();
        }
        case 7:{
            System.exit(0);
        }
       }

    }
    public static void main(String[] args) {
       try123();
    }
}

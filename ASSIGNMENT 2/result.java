import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter number of five subject:");
        int x1=sn.nextInt();
        int x2=sn.nextInt();
        int x3=sn.nextInt();
        int x4=sn.nextInt();
        int x5=sn.nextInt();
        if(x1<40||x2<40||x3<40||x4<40||x5<40){
            System.out.println("you are fail");
        }
        else{
            int tt=x1+x2+x3+x4+x5;
            float p=tt/500*100;
            if (p>80){
                System.out.println("Distanction");
            }
            else if(p>60){
                System.out.println("first division");
            }
            else if(p>50){
                System.out.println("second division");
            }
            else if(p>40){
                System.out.println("third division");
            }
            else{
                System.out.println("fail");
            }
        }

    }
    
}

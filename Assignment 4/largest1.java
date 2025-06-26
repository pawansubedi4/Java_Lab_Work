import java.util.Scanner;
class Largest {
    int a,b,c;
    int lrg(){
        return (a>b)?((a>c)?a:c):((b>c)?b:c);
    }  
}
public class largest1{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Largest obj=new Largest();
        System.out.println("enter any three number:");
        obj.a=sn.nextInt();
        obj.b=sn.nextInt();
        obj.c=sn.nextInt();
        System.out.println("the largest number is "+obj.lrg());
    }
}

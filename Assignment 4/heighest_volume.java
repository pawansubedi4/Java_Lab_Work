
import java.util.Scanner;
class Box{
    double l;
    double b;
    double h;
    void take(double lr,double br,double hr){
        l=lr;
        b=br;
        h=hr;
    }
    double Volume(){
        return (l*b*h);
    }
}
public class heighest_volume {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Box[] obj=new Box[3];
        for (int i=0;i<3;i++){
            obj[i]=new Box();
            System.out.println("enter length breadth and height respectively:");
            double l=sn.nextDouble();
            double b=sn.nextDouble();
            double h=sn.nextDouble();
            obj[i].take(l,b,h);
        }
        if(obj[0].h>obj[1].h&&obj[0].h>obj[2].h){
            System.out.println("the volume is "+(obj[0].Volume()));
        }
        else if(obj[1].h>obj[2].h&&obj[1].h>obj[0].h){
            System.out.println("the volume is "+(obj[1].Volume()));
        }
        else{
            System.out.println("the volume is "+(obj[2].Volume()));
        }

    }
}

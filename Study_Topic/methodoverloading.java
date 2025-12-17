import java.util.Scanner;
public class methodoverloading {
    public void Area(float r){
        float ar=r*r*22/7f;
        System.out.println("The area of circle is "+ar);
    }
    public void Area(int l){
        float ar=l*l;
        System.out.println("The area of square is "+ar);
    }
    public void Area(int l,int b){
        float ar=l*b;
        System.out.println("The area of rectangular is "+ar);
    }

    public void main(String[] aa){
        Scanner sn=new Scanner(System.in);
        System.out.println("1 . Area of circle \n Area of square \n Area of rectangular");
        System.out.println("enter choice from (1 to 3)");
        int n=sn.nextInt();
        if (n==1){
            System.out.println("enter radius:");
            float r=sn.nextFloat();
            Area(r);
        }
        else if(n==2){
            System.out.println("enter length of Square:");
            int l=sn.nextInt();
            Area(l);
        }
        else if(n==3){
            System.out.println("enter length and breadth of rectangular");
            int l=sn.nextInt();
            int b=sn.nextInt();
            Area(l,b);
        }
    }
}

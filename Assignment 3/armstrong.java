
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter range of number to check armstrong but only three digit:");
        int m=sn.nextInt();
        int n=sn.nextInt();
        System.out.println("the armstrong number are:");
        for (int i=m;i<=n;i++){
            int sum=0;
            int j=i;
            while(j!=0){
                int r=j%10;
                sum=sum+r*r*r;
                j=j/10;
            }
            if(i==sum){
                System.out.println(sum);
            }
        }

    }
}

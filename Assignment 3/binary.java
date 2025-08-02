
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("1. decimal to binary\n2. binary to decimal");
        int ch=sn.nextInt();
        if (ch==1){
            System.out.println("enter any number:");
            int x=sn.nextInt();
            int c=0;
            int tem=x;
            while(x!=0){
                c++;
                x=x/2;
            }
            int n1[] =new int[c];
            for (int i=0;i<c;i++){
                n1[i]=tem%2;
                tem=tem/2;
            }
            for (int j=c-1;j>=0;j--){
                System.out.print(n1[j]);
            }
        }
        else if(ch==2){
            System.out.println("enter any binary number:");
            int x=sn.nextInt();
            int c=0;
            int tem=x;
            int sum=0;
            while(x!=0){
                c++;
                x=x/10;
            }
            int n1[]=new int[c];
            for (int i=0;i<c;i++){
                n1[i]=tem%10;
                tem=tem/10;
            }
            for (int j = c-1; j>=0; j--) {
                sum += n1[j] * Math.pow(2, j);  // Process right to left
            }
            System.out.println("the decimal number is "+sum);
        }
    }
}


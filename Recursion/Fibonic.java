import java.util.Scanner;
public class Fibonic{
    public static int fact(int c){
        if (c==1){
            return 0;
        }
        else if (c==2){
            return 1;
        }
        else{
            return fact(c-1)+fact(c-2);
        }

    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sn.nextInt();
        System.out.println("the result is:");
        for(int i=1;i<n;i++){
            System.out.println(fact(i));
        }  
    }
}
import java.util.Scanner;
public class checkdiv {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter by which number do you want to check divisibility:");
        int m=s.nextInt();
        System.out.print("enter how many number do you want to input:");
        int n=s.nextInt();
        System.out.println("enter "+n +" number");
        int[] no =new int[n];
        for (int i=0;i<n;i++){
            no[i]=s.nextInt();
        }
        System.out.println("the result which is divisible by "+m);
        for (int i=0;i<n;i++){
            if(no[i]%m==0){
                System.out.println(no[i]);
            }
        }

    }
}

import java.util.Scanner;
public class Sum_ofarray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter how many number do you want to input:");
        int n=s.nextInt();
        int[] a=new int[n];
        int sum=0;
        System.out.println("enter "+n +"number");
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("the sum of all elements is "+sum);
    }
}


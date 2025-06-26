import java.util.Scanner;

public class Product1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter 30 number:");
        int arr[]=new int[10];
        int pod=1;
        for (int i=0;i<arr.length;i++){
            arr[i]=sn.nextInt();
            if (arr[i]<=5){
                pod=pod*arr[i];
            }
        }
        System.out.println("The product of less then 5 in array is:"+pod);
    }
    
}

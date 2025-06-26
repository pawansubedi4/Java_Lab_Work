
import java.util.Scanner;

public class Betwen {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter 30 number:");
        int arr[]=new int[30];
        for (int i=0;i<arr.length;i++){
            arr[i]=sn.nextInt();
        }
        System.out.println("the number between 16 to 47 in array are:");
        for (int i=0;i<arr.length;i++){
            if(arr[i]>16&&arr[i]<47){
                System.out.println(arr[i]);
            }
        }
    }
}


import java.util.Scanner;

public class One_toN {
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void Recur(int n){
        if (n==0){
            return;
        }
        else{
            Recur(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter how many number do you want to print:");
        int n=sn.nextInt();
        System.out.println("The natural number are upto "+n+" is");
        Recur(n);
    }
}

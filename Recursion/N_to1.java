import java.util.Scanner;
public class N_to1 {
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void Recur(int n){
        if (n==0){
            return;
        }
        else{
            System.out.println(n);
            Recur(n-1);
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

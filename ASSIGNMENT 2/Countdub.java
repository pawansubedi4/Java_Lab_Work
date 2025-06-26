import java.util.Scanner;
public class Countdub {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number to check dublicate");
        int n=s.nextInt();
        int count=0;
        while (n!=0){
            int r=n%10;
            int tc=n/10;
            n=n/10;
            while (tc!=0){
                int t=tc%10;
                tc=tc/10;
                if (r==t){
                    count++;
                    break ;
                }
            }
        }
        System.out.println("the result is"+count);

    }
}

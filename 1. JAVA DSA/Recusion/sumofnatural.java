import java.util.Scanner;
class sum{
    public static int sum1(int n){
        if(n==1){
            return 1;
        }
        return n + sum1(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("The sum of first " + n + " natural numbers is: " + sum1(n));
    }
}
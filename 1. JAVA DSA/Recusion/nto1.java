import java.util.Scanner;
public class nto1 {
    public static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("Printing numbers from 1 to " + n + ":");
        printNumbers(n);
    }
    
}


import java.util.Scanner;

class sum_jagged {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jaggu[][] = new int[2][];
        jaggu[0] = new int[3];
        jaggu[1] = new int[2];
        for(int j = 0; j < jaggu.length; j++) {
            System.out.println("Enter " + jaggu[j].length + " elements:");
            for (int i = 0; i < jaggu[j].length; i++) {
                jaggu[j][i] = s.nextInt();

            }
        }
        int sum;
        for (int j = 0; j < jaggu.length; j++) {
            sum=0;
            for (int i = 0; i < jaggu[j].length; i++) {
                sum = sum + jaggu[j][i];
            }
            System.out.println("the sum of " + (j + 1) + " row is " + sum);
        }
    }
}

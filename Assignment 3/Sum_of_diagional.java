import java.util.Scanner;
public class Sum_of_diagional {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of square matrix:");
        int n=s.nextInt();
        int[][] a=new int[n][n];
        System.out.println("enter elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int l=(n-1);
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||j==l){
                    sum=sum+a[i][j];
                    if (j==l){
                        l--;
                    }
                }
            }
        }
        System.out.println("the sum of diagional elements is "+sum);
    }
}

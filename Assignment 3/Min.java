import java.util.Scanner;
class Min {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter how many number do you want to input:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter "+n +"number");
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int t;
        for(int i=0;i<(n-1);i++){
            if (a[i]<a[i+1]){
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
            }
        }
        System.out.println("the min number is "+a[n-1]);
        for(int i=0;i<(n-2);i++){
            if (a[i]<a[i+1]){
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
            }
        }
        System.out.println("the second min number is "+a[n-2]);
    }
}

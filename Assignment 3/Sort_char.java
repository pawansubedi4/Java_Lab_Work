import java.util.Scanner;

public class Sort_char {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter how many words do you want to enter:");
        int n=s.nextInt();
        char a[]=new char[n];
        System.out.println("enter single charecter:");
        for (int i=0;i<n;i++){
            a[i]=s.next().charAt(0);
        }
        char t;
        System.out.println("the result is:");
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            System.out.println(a[i]);
        }


    }
}

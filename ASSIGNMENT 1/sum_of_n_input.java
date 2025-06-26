import java.util.Scanner;
class Sumofnno{
    public static void main(String[] args){
        int sum=0;
        Scanner sn=new Scanner(System.in);
        System.out.println("enter how many number do you want:");
        int a =sn.nextInt();
        for (int i=0;i<a;i++)
        {
            System.out.print("enter "+(i+1)+ " number");
            int n=sn.nextInt();
            sum=sum+n;
        }
        System.out.println("the result is "+sum);
        
    }
}
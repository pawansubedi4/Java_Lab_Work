import java.util.Scanner;
class revof3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any three digit number:");
        int n=s.nextInt();
        int su=0;
        if(n<999&&n>99)
        {
            while(n!=0)
            {
                int d=n%10;
                su=su*10+d;
                n=n/10;
            }
            System.out.println("the rev is "+su);
        }
        else{
            System.out.println("invalid number");
        }
    }
    
}

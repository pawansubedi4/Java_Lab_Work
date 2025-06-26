import java.util.Scanner;
class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int dCount=0;
        for (int d=0;d<=9;d++) {
            int temp=n;
            int c=0;
            while (temp!=0) {
                int digit =temp%10;
                if (digit==d) {
                    c++;
                }
                temp/=10;
            }
            if(c>1){
                dCount++;
            }
        }
        System.out.println("Number of duplicate digits: "+dCount);
    }
}
